// number of denominations using greedy
#include<iostream>
using namespace std;
#define COINS 4
#define MAX 20
// All denominations of Indian Currency
int coins[COINS] = { 1, 5, 6, 9};
void findMin(int cost)
{
	int coinList[MAX] = { 0 };
	int i, k = 0;
	for (i = COINS - 1; i >= 0; i--) {
		while (cost >= coins[i]) {
			cost -= coins[i];
			// Add coin in the list
			coinList[k++] = coins[i];
		}
	}
	for (i = 0; i < k; i++) {
		// Print
		cout<<coinList[i]<<" ";
	}

}
int main(void)
{
	// input value
	int n;
        cin>>n;
       findMin(n);
	return 0;
}


