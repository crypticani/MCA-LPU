#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX 20

int top = -1;
char stack[MAX];
char pop();
void push(char);

int main()
{
    char str[20];
    unsigned int i;
    printf("Enter the string : ");
    gets(str);
    /*Push characters of the string str on the stack */
    for (i = 0; i < strlen(str); i++)
        push(str[i]);

    display();

    return 0;

} /*End of main()*/

void push(char item)
{
    if (top == (MAX - 1))
    {
        printf("\nStack Overflow\n");
        return;
    }
    stack[++top] = item;
} /*End of push()*/

char pop()
{
    if (top == -1)
    {
        printf("\nStack Underflow\n");
        exit(1);
    }
    return stack[top--];
} /*End of pop()*/

void display()
{
    int count = 0;
    if (top == -1) // checks if stack is empty
    {
        printf("Stack is empty\n");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            if(stack[i] == 'a' || stack[i] == 'e' || stack[i] == 'i' || stack[i] == 'o' || stack[i] == 'u' || stack[i] == 'A' || stack[i] == 'E' || stack[i] == 'I' || stack[i] == 'O' || stack[i] == 'U')
                count+=1;
        }
        printf("Number of vowels: %d.", count);
    }
}