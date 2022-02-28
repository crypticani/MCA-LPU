#include <stdio.h>

#define MAX_SIZE 100

void insert();
void delete_min();
void display();

int arr_queue[MAX_SIZE];
int rear =0, front = 0;

int main()
{
    int n;
// queue operations for enqueuing elements, 
    printf("Enter the no of queue elements: ");
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        insert();
    }
    // deleting minimum valued item from queue and displaying the elements of queue
    delete_min();
    return 0;
}

void insert()
{
    int item;
    if (rear == MAX_SIZE)
        printf("\n## Queue Reached Max!!");
    else
    {
        printf("\nEnter The Value to be Inserted : ");
        scanf("%d", &item);
        printf("# Position : %d , Inserted Value  : %d ", rear + 1, item);
        arr_queue[rear++] = item;
    }
}

void delete_min()
{
    if (front == rear)
        printf("\n## Queue is Empty!");
    else
    {
        int min_element, index = 0;
        display();
        for (int i = front; i < rear; i++)
        {
            if (arr_queue[i] < arr_queue[index])
            {
                index = i;
            }
        }
        min_element = arr_queue[index];
        printf("\nMinimum element is %d.\n", min_element);
        printf("Deleting it\n");

        for(int i=index; i<rear; i++){
            arr_queue[i] = arr_queue[i+1];
        }
        rear = rear - 1;
        display();
    }
}

void display()
{
    printf("\n## Queue Size : %d \n", rear);
    for (int i = front; i < rear; i++)
        printf("%d ", arr_queue[i]);
}