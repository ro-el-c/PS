// 평범한 배낭
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n, k;
    cin >> n >> k;

    int w, v;
    int dp[n+1][k+1];
    for (int i=0; i<=k; i++) dp[0][i] = 0;
    for (int i=0; i<=n; i++) dp[i][0] = 0;
    
    for (int thing=1; thing<=n; thing++){ // n번째 물건
        cin >> w >> v;
        for (int cap=1; cap<=k; cap++){ // 가방 용량
            if (w > cap) dp[thing][cap] = dp[thing-1][cap]; // 용량이 현재 무게보다 작을 때
            else{
                int temp=0;
                if(k-cap>=0 && cap-w>0) temp = dp[thing-1][cap-w];

                dp[thing][cap] = max(dp[thing-1][cap], temp + v);
            }
        }
    }

    cout << dp[n][k];
}