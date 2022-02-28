#include <stdio.h>
int stack[100], i, j, choice = -1, n, top = -1;
void push();
void display();

void main()
{
    printf("A program to insert an item in stack\n");
    printf("Enter the size of the Stack: ");
    scanf("%d", &n);
    printf("\n--------------------------------------\n");
    while (choice != 0)
    {
        printf("Chose one from the below options...");
        printf("\n1.Push\n2.Display\n0.Exit");
        printf("\n Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            push(); // function called for insertion of element in stack
            break;
        }
        case 2:
        {
            display(); // function called for displaying the stack elements
            break;
        }
        case 0:
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
    if (top == n - 1) // checks whether the stack is full
        printf("\nOverflow\n");
    else
    {
        printf("Enter the value: ");
        scanf("%d", &val);
        top = top + 1;
        stack[top] = val;
    }
}

void display()
{
    if (top == -1) // checks if stack is empty
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (i = top; i >= 0; i--)
        {
            printf("%d ", stack[i]);
            printf("\n");
        }
    }
}