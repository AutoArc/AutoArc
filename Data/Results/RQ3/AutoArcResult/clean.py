#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import os
import sys

def main():
    # 要匹配的子串列表
    patterns = ["violations.log", "out.csv", "api.json"]

    # 当前工作目录
    cwd = os.getcwd()

    # 遍历目录下所有文件
    for fname in os.listdir(cwd):
        # 只处理文件（跳过子目录）
        fullpath = os.path.join(cwd, fname)
        if not os.path.isfile(fullpath):
            continue

        # 如果文件名中包含任意一个模式，则删除
        if any(pat in fname for pat in patterns):
            try:
                os.remove(fullpath)
                print(f"Deleted: {fname}")
            except Exception as e:
                print(f"Error deleting {fname}: {e}", file=sys.stderr)

if __name__ == "__main__":
    main()
