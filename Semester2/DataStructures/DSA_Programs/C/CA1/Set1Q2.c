#include <stdio.h>
#include <stdlib.h>
void push();
void pop();
void display();
int isPrime(int);
void getPrime();

struct node
{
    int val;
    struct node *next;
};
struct node *head;

void main()
{
    int choice = 0;
    printf("\nFrequency of prime numbers from stack using linked list\n");
    while (choice != 5)
    {
        printf("\n\nChose one from the below options...\n");
        printf("\n1.Push\n2.Pop\n3.Show\n4.Frequency of Prime no\n5.Exit");
        printf("\n Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            push();
            break;
        }
        case 2:
        {
            pop();
            break;
        }
        case 3:
        {
            display();
            break;
        }
        case 4:
            getPrime();
            break;
        case 5:
        {
            printf("Exiting....");
            break;
        }
        default:
        {
            printf("Please Enter valid choice ");
        }
        };
    }
}
void push()
{
    int val;
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL)
    {
        printf("not able to push the element");
    }
    else
    {
        printf("Enter the value: ");
        scanf("%d", &val);
        if (head == NULL)
        {
            ptr->val = val;
            ptr->next = NULL;
            head = ptr;
        }
        else
        {
            ptr->val = val;
            ptr->next = head;
            head = ptr;
        }
        printf("Item pushed");
    }
}

void pop()
{
    int item;
    struct node *ptr;
    if (head == NULL)
    {
        printf("Underflow");
    }
    else
    {
        item = head->val;
        ptr = head;
        head = head->next;
        free(ptr);
        printf("Item popped");
    }
}
void display()
{
    int i;
    struct node *ptr;
    ptr = head;
    if (ptr == NULL)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("Printing Stack elements \n");
        while (ptr != NULL)
        {
            printf("%d ", ptr->val);
            ptr = ptr->next;
        }
        printf("\n");
    }
}

// Function to check if a number is prime
int isPrime(int n)
{
    // Corner cases
    if ((n == 2) || (n == 3))
        return n;

    if (n == 1 || n % 2 == 0 || n % 3 == 0)
        return -1;
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return -1;
    return n;
}

void getPrime()
{
    struct node *ptr;
    ptr = head;
    int count = 0;
    while (ptr != NULL)
    {
        int p = isPrime(ptr->val);
        if (p != -1)
        {
            count+=1;
        }
        ptr = ptr->next;
    }
    display();
    printf("\nFrequency of Prime Numbers is %d.", count);
}