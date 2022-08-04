#include<iostream>
using namespace std;

int main()
{ int n, s;
cin>>n>>s;
int coins[n+1];
for(int i=1; i<=n; i++)
    { cin>>coins[i]; }

int dp[s+1];
dp[0] = 0;
int inf = INT_MAX;
for(int i=1; i<=s; i++){
    dp[i] = inf;
}

for(int i=1; i<=s; i++){
        int ans = inf;
    for(int j=1; j<=n; j++){
        if(coins[j] <= i){
            ans = min(ans, dp[i-coins[j]]);
        }

        if(ans == inf){
            dp[i] == inf;
        }else{
            dp[i] = ans + 1;
        }
    }
}

if(dp[s] == inf){
    cout<<-1<<endl;
}else{
    cout<<dp[s]<<endl;
}

}
