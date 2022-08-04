#include<iostream>
using namespace std;
static int num1=0, num2=1;
void fib(int num)
{
int num3;
if(num>0)
{
num3=num1+num2;
cout<<" "<<num3<<" ";
num1=num2;
num2=num3;
fib(num-1);
}
}

int main()
{
int num;
cout<<"enter the number"<<endl;
cin>>num;
cout<<"Fib:"<<endl;
cout<<num1<<" "<<num2;
fib(num-2);
return 0;
}
