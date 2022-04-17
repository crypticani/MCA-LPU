#include <stdio.h>
#include <malloc.h>

void insert();
void delete();
void display();

struct node{
    int priority;
    int info;
    struct node *next;
} *start = NULL, *q, *temp, *new;

typedef struct node N;
int main(){
    int choice;
    do{
        printf("\nEnter your choice:\n");
        printf("1.Insertion\n2.Deletion\n3.Display\n4.Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:insert();
            break;
        case 2: delete();
            break;
        case 3: display();
            break;
        case 4:
            break;
        default:
            printf("Invalid Input!");
        }
    } while(choice<4);
}

void insert(){
    int item, itprio;
    new = (N *)malloc(sizeof(N));
    printf("Enter the element to be inserted: ");
    scanf("%d", &item);
    printf("Enter it's priority: ");
    scanf("%d", &itprio);
    new->info = item;
    new->priority = itprio;
    new->next = NULL;

    if(start == NULL){
        start = new;
    }
    else if (start != NULL && itprio <= start->priority){
        new->next = start;
        start = new;
    }
    else{
        q = start;
        while (q->next != NULL && q->next->priority <= itprio){
            q = q->next;
        }
        new->next = q->next;
        q->next = new;
    }
}

void delete(){
    if(start == NULL){
        printf("Queue is Empty!");
    }
    else{
        new = start;
        printf("\nDeleted Element is: %d\n", new->info);
        start = start->next;
    }
}

void display(){
    temp = start;
    if(start == NULL){
        printf("Queue is empty");
    }
    else{
        printf("Queue is:\n");
        if(temp != NULL){
            printf("Element\tPriority\n");
            for(temp = start; temp != NULL; temp = temp->next){
                printf("%d\t%d\n", temp->info, temp->priority);
            }
        }
    }
}