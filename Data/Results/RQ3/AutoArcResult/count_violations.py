import os
import csv
from collections import defaultdict

def get_max_first_column(file_path):
    """读取CSV文件第一列的最大整数值（无标题行）"""
    max_val = 0
    try:
        with open(file_path, 'r') as f:
            reader = csv.reader(f)
            for row_idx, row in enumerate(reader):
                if not row:  # 跳过空行
                    continue
                try:
                    current = int(row[0].strip())
                    max_val = max(max_val, current)
                except (ValueError, IndexError) as e:
                    error_type = "数值转换失败" if isinstance(e, ValueError) else "列索引越界"
                    raise ValueError(f"{error_type} (第{row_idx+1}行: {row})")
        return max_val
    except Exception as e:
        raise RuntimeError(f"文件读取失败: {str(e)}")

def get_rule_type(number):
    """根据规则编号确定类型（35周期分组）"""
    remainder = (number - 1) % 35
    group_pos = remainder + 1
    
    if group_pos <= 10:
        return 'Leveled'
    elif 11 <= group_pos <= 20:
        return 'Leveled_with_attribute'
    elif 21 <= group_pos <= 30:
        return 'Stringed'
    else:
        return 'Null'

def parse_filename(filename):
    """解析文件名并返回(规则类别, 编号)"""
    try:
        base = filename.split('.')[0]
        if 'Rule' not in base:
            raise ValueError("缺少Rule关键字")
        
        rule_part, num_part = base.split('Rule', 1)
        if not num_part.isdigit():
            raise ValueError("编号部分包含非数字字符")
        
        return rule_part, int(num_part)
    except ValueError as ve:
        raise ve
    except Exception as e:
        raise ValueError(f"文件名解析异常: {str(e)}")

def main():
    directory = "."  # 修改为实际目录路径
    category_stats = defaultdict(int)
    type_stats = defaultdict(int)
    unscanned_files = []

    for filename in os.listdir(directory):
        if not filename.endswith('.violations.csv'):
            continue

        full_path = os.path.join(directory, filename)
        error_msg = None
        
        # 文件名解析阶段
        try:
            rule_category, rule_number = parse_filename(filename)
        except Exception as e:
            error_msg = f"文件名解析错误: {str(e)}"
        
        # 文件内容处理阶段
        if not error_msg:
            try:
                max_value = get_max_first_column(full_path)
            except Exception as e:
                error_msg = f"内容处理错误: {str(e)}"
        
        # 错误处理
        if error_msg:
            unscanned_files.append(f"{filename} ({error_msg})")
            continue

        # 统计处理
        category_stats[rule_category] += max_value
        type_stats[get_rule_type(rule_number)] += max_value

    # 输出统计结果
    print("=== 规则类别统计 ===")
    for category in sorted(category_stats.keys()):
        print(f"{category.ljust(15)}: {category_stats[category]}")

    print("\n=== 数字类型统计 ===")
    for ttype in ['Leveled', 'Leveled_with_attribute', 'Stringed', 'Null']:
        print(f"{ttype.ljust(22)}: {type_stats.get(ttype, 0)}")

    if unscanned_files:
        print("\n=== 未扫描/处理失败的文件 ===")
        for f in unscanned_files:
            print(f)

if __name__ == '__main__':
    main()