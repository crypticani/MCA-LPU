import re


def editorMiss(textInput):
    count = 0
    for i in textInput:
        if not (re.search('[A-Za-z0-9\s]+$', i)):
            count+=1
    return count


def main():
    #input for text input
    textInput = str(input())

    result = editorMiss(textInput)
    print(result)


if __name__ == "__main__":
    main()
