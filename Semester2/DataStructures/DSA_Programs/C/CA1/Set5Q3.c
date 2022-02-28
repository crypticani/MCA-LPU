#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *front;
struct node *rear;

void insert();
void display();

void main()
{
    int choice;
    while(1)
    {
        printf("\nQueue operation");
        printf("\n1.insert an element\n2.Display the queue\n0.Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            insert();
            break;
        case 2:
            display();
            break;
        case 0:
            exit(0);
            break;
        default:
            printf("\nEnter valid choice!!\n");
        }
    }
}

void insert()
{
    struct node *ptr;
    int item;

    ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL)
    {
        printf("\nOVERFLOW\n");
        return;
    }
    else
    {
        printf("\nEnter value: ");
        scanf("%d", &item);
        ptr->data = item;
        if (front == NULL) //inserting node in empty queue
        {
            front = ptr;
            rear = ptr;
            front->next = NULL;
            rear->next = NULL;
        }
        else //inserting node next to the previous node
        {
            rear->next = ptr;
            rear = ptr;
            rear->next = NULL;
        }
        printf("Inserted!\n");
    }
}

void display()
{
    struct node *ptr;
    ptr = front;
    if (front == NULL)
        printf("\nEmpty queue\n");
    else
    {
        printf("\nValues inside Queue are: ");
        while (ptr != NULL)
        {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        }
        printf("\n");
    }
}