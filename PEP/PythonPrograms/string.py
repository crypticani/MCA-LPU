def repeatedWords(textInput):
    words = textInput.split(" ")
    for i in range(0, len(words)):  
        count = 1
    for j in range(i+1, len(words)):  
        if(words[i] == (words[j])):  
            count = count + 1;  
            #Set words[j] to 0 to avoid printing visited word  
            words[j] = "0";  


def main():
    #input for text input
    textInput = str(input())

    result = repeatedWords(textInput)
    print(result)

if __name__ == "__main__":
    main()
