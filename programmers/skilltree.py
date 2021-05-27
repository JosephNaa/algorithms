def solution(skill, skill_trees):
    answer = 0

    for tree in skill_trees:
        skill_list = list(skill)

        for t in tree:
            if t in skill:
                if t != skill_list.pop(0):
                    break
        else:
            answer += 1

    return answer

if __name__ == '__main__':
    skill = "CBD"
    skill_trees = ["BACDE", "CBADF", "AECB", "BDA"]

    result = solution(skill, skill_trees)
