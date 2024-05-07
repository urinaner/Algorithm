import csv
import json

# csv 파일 경로
csv_file_path = '외국어 가능 약국 현황.csv'

# csv 파일 읽어오기
with open(csv_file_path, 'r', encoding='UTF-8') as f:
    reader = csv.reader(f)
    next(reader) 

    # 각 라인마다 딕셔너리 생성 후 리스트에 추가
    data = []
    for line in reader:
        d = {
            'id': int(line[0]),
            'name': line[1],
            'cityId': int(line[2])
        }
        data.append(d)

# json string으로 변환
json_string = json.dumps(data, ensure_ascii=False, indent=2)

# print(json_string)

# txt 파일로 저장할 경로
txt_file_path = 'data.txt'

# txt 파일 쓰기
with open(txt_file_path, 'w', encoding='utf-8') as f:
    f.write(json_string)