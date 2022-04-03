//Descending Priority Queue
#include <stdio.h>
#include <malloc.h>

void insert();
void del();
void display();

struct node
{
    int priority;
    int info;
    struct node *next;
} *start = NULL, *q, *temp, *new;

typedef struct node N;

int main(){
    int ch;
    do{
        printf("\n1. Insertion\n2. Deletion\n3. Display\n4. Exit\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            insert();
            break;
        case 2:
            del();
            break;
        case 3:
            display();
            break;
        case 4:
            break;
        default:
            printf("\nInvalid Choice!");
        }
    }while (ch<4);
}

void insert(){
    int item, itprio;
    new = (N *)malloc(sizeof(N));
    printf("Enter Element: ");
    scanf("%d", &item);
    printf("Enter it's priority: ");
    scanf("%d", &itprio);

    new->info = item;
    new->priority = itprio;
    new->next = NULL;

    if (start == NULL)
    {
        start = new;
    }
    else if (start !=NULL && itprio >=start->priority)
    {
        new->next = start;
        start = new;
    }
    else
    {
        q = start;
        while (q->next != NULL && q->next->priority >=itprio)
        {
            q = q->next;
        }
        new->next = q->next;
        q->next = new;   
    }  
}

void del()
{
    if(start == NULL){
        printf("Queue is empty");
    }
    else{
        new = start;
        printf("\n Deleted item is %d \n", new->info);
        start = start->next;
    }
}

void display(){
    temp = start;
    if(start == NULL)
        printf("Queue is Empty!\n");
    else{
        printf("Queue is:\n");
        if(temp!=NULL){
            printf("Element\tPriority");
            for (temp = start; temp!=NULL; temp=temp->next)
            {
                printf("\n%d\t%d", temp->info, temp->priority);
            }
            
        }
    }
}
