/* A program to reverse the stack elements
    and then find the index of minimum valued number
    using array. */

#include <stdio.h>

#define TRUE 1
#define FALSE 0

void push(int);
int pop();
void printStack();
void sumOfOdd();

// Stack data structure
int top = -1;
int arr_stack[20];
int SIZE = 0;

int main()
{
    int temp;
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
    
    sumOfOdd();
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
        arr_stack[top] = num;
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
        return arr_stack[top + 1];
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
            printf("%d ", arr_stack[i]);
        }
        printf("\n");
    }
}

void sumOfOdd(){
    int sum = 0;
    if (isEmpty()) // checks if stack is empty
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            if(arr_stack[i]%2 != 0)
                sum += arr_stack[i];
        }
        printf("Sum of odd numbers: %d", sum);
    }
}