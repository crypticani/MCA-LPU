#include <stdio.h>
int main ()
{
int marks[5]={1,2,3,4,5};
int i;
int j,temp;
for (i=0;i<5;i++)
{
printf("%d\n",marks[i]);
}

for (i=0,j=4;i<j;i++,j--)
{
temp=marks[i];
marks[i]=marks[j];
marks[j]=temp;


}
printf("The reverse of above array is:");
for (i=0;i<5;i++)
{
printf("%d\n",marks[i]);
}
}