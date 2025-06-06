#!/usr/bin/env bash
#
# ./bin/AutoArc.sh
#
# 说明：
#   1. 第一步要在 ./lib/TranslaterMappingLayer/ 目录下执行 trans_mapping；
#   2. 第二步运行 ConferenceChecker.jar；
#   3. 根据 ${PROJECTNAME}.violation.csv 判断退出码。
#

set -euo pipefail

########################################
# 参数解析
########################################
while [[ "$#" -gt 0 ]]; do
    case "$1" in
        -d|--dir)
            DIR="$2"; shift
            ;;
        -r|--rule)
            RULE="$2"; shift
            ;;
        -p|--projectname)
            PROJECTNAME="$2"; shift
            ;;
        -t|--type)
            TYPE="$2"; shift
            ;;
        *)
            echo "[ERROR] Unknown parameter: $1" >&2
            exit 1
            ;;
    esac
    shift
done

if [[ -z "${DIR:-}" || -z "${RULE:-}" || -z "${PROJECTNAME:-}" || -z "${TYPE:-}" ]]; then
    echo "Usage: $0 -d <dir> -r <rule> -p <projectname> -t <type>" >&2
    exit 1
fi


TRANSLATER_DIR="./lib/TranslaterMappingLayer"
TRANSLATER_PATH="${TRANSLATER_DIR}/trans_mapping"
API_JSON="${TRANSLATER_DIR}/api.json"
CONFERENCE_CHECKER_JAR="./lib/ConferenceChecker.jar"
FINAL_OWNERSHIP="./data/LineageOS-16.0/finalownership.csv"
ENRE_JSON="./lib/enre.json"
IGNORES="./ignores.txt"
VIOLATION_FILE="${PROJECTNAME}.violation.csv"


if [[ ! -x "$TRANSLATER_PATH" ]]; then
    echo "[INFO] Adding execute permission to $TRANSLATER_PATH"
    chmod +x "$TRANSLATER_PATH" || {
        echo "[ERROR] Failed to chmod +x $TRANSLATER_PATH" >&2
        exit 1
    }
fi

echo "[INFO] Running rule translator (trans_mapping) with --nl \"$RULE\""
(
   
    cd "$TRANSLATER_DIR"
    ./trans_mapping --nl "$RULE"
)
if [[ $? -ne 0 ]]; then
    echo "[ERROR] Rule translation failed." >&2
    exit 1
fi


if [[ ! -f "$API_JSON" ]]; then
    echo "[ERROR] API JSON file not found at $API_JSON" >&2
    exit 1
fi


echo "[INFO] Running ConferenceChecker.jar"
java -jar "$CONFERENCE_CHECKER_JAR" \
     "$DIR"\
     "$FINAL_OWNERSHIP" \
	 "$PROJECTNAME"\
    "$ENRE_JSON" \
    "$IGNORES" \
    "$API_JSON" \
     "$TYPE"

if [[ $? -ne 0 ]]; then
    echo "[ERROR] ConferenceChecker failed." >&2
    exit 1
fi


if [[ -f "$VIOLATION_FILE" && -s "$VIOLATION_FILE" ]]; then
    echo "[WARN] Architecture violations found in ${VIOLATION_FILE}"
    exit 4
else
    echo "[INFO] No architecture violations."
    exit 0
fi
