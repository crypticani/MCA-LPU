def getSum(n):
    sum = 0
    for digit in str(n):
        sum += int(digit)
    return sum


def Decode(pinArray):
    pin = ""
    for i in pinArray:
        while i > 9:
            i = getSum(i)
        if i % 2 == 0:
            pin = pin + str(i)
        else:
            if i == 1:
                pin = pin + "a"
            elif i == 3:
                pin = pin + "c"
            elif i == 5:
                pin = pin + "e"
            elif i == 7:
                pin = pin + "g"
            elif i == 9:
                pin = pin + "i"
    return pin


def main():
    pinArray = list(map(int, input("elements of array:-").strip().split()))

    print(Decode(pinArray))


if __name__ == "__main__":
    main()
