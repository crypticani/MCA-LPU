#include <iostream>
using namespace std;
int LinearSearch(int arr[],  int search,int index,int n);
int main()
{
    int n, search, result, m = 0, arr[100];
    cout<<"Program on Linear Search"<<"\n";
    cout<<"-------\n";
    cout<<"Enter the total elements in the array"<<"\n";
    cin>>n;

    cout<<"Enter the array elements"<<"\n";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    cout<<"Enter the element to search"<<"\n";
    cin>>search;
    result =  LinearSearch(arr,  search,0,n);
    if (result != 0)
    {
        cout<<"Element found at pos"<<"\n"<<result;
    }
    else
    {
        cout<<"Element not found";
    }
return 0;
}
int LinearSearch(int arr[],  int search,int index,int n)
{
    int arrpos=0;
    if(index>=n)
    {
        return 0;
    }
        if (arr[index] == search)
        {
            arrpos = index + 1;
            return arrpos;

        }
        else
        {
        return LinearSearch(arr, search,index+1,n);
        }


    return arrpos;
}
