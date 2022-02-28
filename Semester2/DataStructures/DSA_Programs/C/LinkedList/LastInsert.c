#include <stdio.h>
#include <stdlib.h>
void lastinsert(int);
void display();
struct node
{
    int data;
    struct node *next;
};
struct node *head;
void main()
{
    int choice, item;
    do
    {
        printf("\nEnter the item which you want to insert?\n");
        scanf("%d", &item);
        lastinsert(item);
        display();
        printf("\nPress 0 to insert more ?\n");
        scanf("%d", &choice);
    } while (choice == 0);
}
void lastinsert(int item)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *temp;
    if (ptr == NULL)
    {
        printf("\nOVERFLOW");
    }
    else
    {
        ptr->data = item;
        if (head == NULL)
        {
            ptr->next = NULL;
            head = ptr;
            printf("\nNode inserted");
        }
        else
        {
            temp = head;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = ptr;
            ptr->next = NULL;
            printf("\nNodes inserted");
        }
    }
}

void display()
{
    struct node *t;
    t = head;
    while (t != NULL)
    {
        printf("%d\n", t->data);
        t = t->next;
    }
}