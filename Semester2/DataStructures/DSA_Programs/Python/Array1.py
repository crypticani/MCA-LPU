from json.tool import main


def ArrayLength(Data):
    length = len(Data)
    return length


def Boundary(Data):
    lower = Data[0]
    upper = Data[6]


def MemoryAllocation(Data):
    print()


def main():
    Data = [12, 23, 34, 45, 56, 67, 78, 89, 90, 100]
    print("Array")
    print(ArrayLength(Data))

if __name__ == "__main__":
    main()