#include <bits/stdc++.h>
using namespace std;
#define n 20
class que{
    int a[n];
    int front,back;
    public:
       que(){front=back=-1;}
       void push(int x){
           if(back==n-1){
               cout<<"OVERFLOW"<<endl;
               return;
           }
           a[++back]==x;
           if(front==-1){front++;}
       }
      void pop(){
          if(front==-1  front>back){
              cout<<"NO element to queue";
              return;
          }front++;
      }
       void display(){
           if(front==-1  front>back){
               cout<<"empty Queue";return;
           }
           for(int i=front+1;i<=back;i++){
               cout<<a[i]<<endl;
           }
       }
};
int main(){
    int ch,item;
    que q;
    while(1){
        cout<<"\n1.Insert \n2.delete \n3.display \nExit \nEnter your choice:- "; cin>>ch;
        switch(ch){
            case 1:{cout<<"Enter the element:- ";cin>>item;
                   q.push(item);break;
            }
            case 2:{q.pop();break;}
            case 3:{q.display();break;}
            case 4:{exit(0);}
            default: {cout<<"Invalid Choice"<<endl;}
        }
    }return 0;
}