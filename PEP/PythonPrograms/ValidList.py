def validateK(arr, L, K):
    new_arr = []
    for _ in range(0, L):
        if arr[_] < K:
            new_arr.append(arr[_])
    return new_arr

def valid_list(arr, L, K):
    a = validateK(arr, L, K)
    result = []
    for i in range(0, len(a)):
        num = a[i]
        string_arr = str(num)
        seperate_digits = list(map(int, string_arr))
        prev = seperate_digits[0]
        flag = 0
        for _ in range(1, len(seperate_digits)):
            cur = seperate_digits[_]
            if((cur-prev)==1 or (cur-prev)==0 or (cur-prev)==-1):
                flag = 1
            else:
                flag = 0
                break
        if flag==1:
            result.append(int(num))
    return result

def main():
    N = int(input())
    for _ in range(0, N):
        L, K = map(int, input().split())
        arr = list(map(int, input().split()))
        res = valid_list(arr, L, K)
        for e in res: print(e, end=' ')
        print()


if __name__ == "__main__":
    main()