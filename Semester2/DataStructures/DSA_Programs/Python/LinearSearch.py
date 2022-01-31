def LinearSearch(arr, toSearch):
    found = 0
    for i in range(0, len(arr)-1):
        if arr[i] == toSearch:
            found += 1
            return "Found " +str(toSearch)+ " at Position "+ str(i+1)

    if found == 0:
        return "Not Found"


def main():
    arr = list(map(int, input("elements of array: ").strip().split()))
    toSearch = int(input("Enter element to Search: "))
    print(LinearSearch(arr, toSearch))


if __name__ == "__main__":
    main()
    
