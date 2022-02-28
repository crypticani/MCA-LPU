#include <stdio.h>

#define TRUE 1
#define FALSE 0

void push(int);
int pop();
void printStack();
void frequency(int);

// Stack data structure
int top = -1;
int DATA[20];
int SIZE = 0;

int main()
{
    int temp, n;
    /* Inserting elements in stack */
    printf("Enter the number of elements (not more than 20): ");
    scanf("%d", &SIZE);
    printf("Enter the elements of stack:\n");
    for(int i=0; i<SIZE; i++){
        scanf("%d", &temp);
        push(temp);
    }
    printf("Values in stack\n");
    printStack();
    
    printf("Enter the number to find the frequency: ");
    scanf("%d", &n);
    frequency(n);
    return 0;
}

/*
 Checks if Stack is Full or not
*/
int isFull()
{
    if (top >= SIZE - 1)
        return TRUE;
    else
        return FALSE;
}

/*
 Checks if Stack is Empty or not
*/
int isEmpty()
{
    if (top == -1)
        return TRUE;
    else
        return FALSE;
}

/*
 Adds an element to stack and then increment top index
*/
void push(int num)
{
    if (isFull())
        printf("Stack is Full...\n");
    else
    {
        top = top + 1;
        DATA[top] = num;
    }
}

/*
 Removes top element from stack and decrement top index
*/
int pop()
{
    if (isEmpty())
        printf("Stack is Empty...\n");
    else
    {
        top = top - 1;
        return DATA[top + 1];
    }
}

// Prints elements of stack
void printStack()
{
    if (top == -1) // checks if stack is empty
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            printf("%d ", DATA[i]);
        }
        printf("\n");
    }
}

void frequency(int num){
    int count = 0;
    if (isEmpty()) // checks if stack is empty
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            if(DATA[i] == num)
                count+=1;
        }
        printf("frequency of %d is: %d", num, count);
    }
}