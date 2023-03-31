// 점프 점프
#include <iostream>
#include <vector>
#include <algorithm>
#define MAX 1001
using namespace std;

int main(){
    int n;
    cin >> n;

    vector<int> vt(n), dp(n);
    for(int i=0; i<n; i++) {
        cin >> vt[i];
        dp[i] = MAX;
    }

    dp[0] = 0;
    for(int i=0; i<n; i++){
        for(int j=1; j<=vt[i] && i+j<n; j++){
            dp[i+j] = min(dp[i] + 1, dp[i+j]);
        }
    }

    cout << (dp[n-1]==MAX ? -1 : dp[n-1]);
}