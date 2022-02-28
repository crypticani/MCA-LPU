#include <stdio.h>

#define MAX_SIZE 100

void insert();
void frequency();
void display();
int isPrime(int);

int arr_queue[MAX_SIZE];
int rear =0, front = 0;

int main()
{
    int n;
// queue operations for enqueuing elements, 
    printf("Enter the no of queue elements: ");
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        insert();
    }
    
    frequency();
    return 0;
}

void insert()
{
    int item;
    if (rear == MAX_SIZE)
        printf("\n## Queue Reached Max!!");
    else
    {
        printf("\nEnter The Value to be Inserted : ");
        scanf("%d", &item);
        printf("Inserted!");
        arr_queue[rear++] = item;
    }
}

// Function to check if a number is prime
int isPrime(int n)
{
    // Corner cases
    if ((n == 2) || (n == 3))
        return 1;

    if (n == 1 || n % 2 == 0 || n % 3 == 0)
        return -1;
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return -1;
    return 1;
}

void frequency()
{
    if (front == rear)
        printf("\n## Queue is Empty!");
    else
    {
        int count = 0;
        for (int i = front; i < rear; i++)
        {
            if (isPrime(arr_queue[i]) == 1)
                count+=1;
        }
        printf("\nFrequency of Prime No: %d", count);
    }
}

void display()
{
    printf("\n## Queue Size : %d \n", rear);
    for (int i = front; i < rear; i++)
        printf("%d ", arr_queue[i]);
}