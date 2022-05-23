def CountFile(fr):
    word_len = 0
    str_len_without_space = 0
    str_len_space = 0
    line_len = 0

    lines = fr.readlines()
    for line in lines:
        line = line.strip()
        word_len += len(line.split())
        str_len_without_space += len(line.replace(" ", ""))
        str_len_space += len(line)
        line_len += 1
        
    fw.write("단어 수:" + str(word_len) + "\n")
    fw.write("문자 수(공백제외):" + str(str_len_without_space) + "\n")
    fw.write("문자 수(공백포함):" + str(str_len_space) + "\n")
    fw.write("줄 수:" + str(line_len))

try:
    fr = open("input.txt", 'r', encoding='utf-8')
    fw = open("output.txt", 'w', encoding='utf-8')
    
    CountFile(fr)
    
    fr.close()
    fw.close()
except:
    print("파일이 없습니다.")