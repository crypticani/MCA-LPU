/* A program to reverse the stack elements
    and then find the index of minimum valued number
    using array. */

#include <stdio.h>

#define TRUE 1
#define FALSE 0

void push(int);
int pop();
void printStack();
void reverse();
void MinElement();

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
    printf("Original Stack\n");
    printStack();
    reverse();
    printf("\nReversed Stack\n");
    printStack();
    MinElement();
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

void insertAtBottom(int item)
{
    if (isEmpty())
    {
        push(item);
    }
    else
    {
        /* Store the top most element of stack in top variable and
        recursively call insertAtBottom for rest of the stack */
        int top = pop();
        insertAtBottom(item);

        /* Once the item is inserted at the bottom, push the
        top element back to stack */
        push(top);
    }
}

void reverse()
{
    if (!isEmpty())
    {
        /* keep on popping top element of stack in
        every recursive call till stack is empty  */
        int top = pop();
        reverse();

        /* Now, insert the top element at the bottom of stack */
        insertAtBottom(top);
    }
}

// for finding the index of min element
void MinElement()
{
    int index = 0;
    for (int i = top; i >= 0; i--)
    {
        if (arr_stack[i] < arr_stack[index])
        {
            index = i;
        }
    }
    printf("\nMinimum element is present at index %d and is %d(th) element from the top.\n", index, top-index+1);
}