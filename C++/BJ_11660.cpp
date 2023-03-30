// 구간 합 구하기 5
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, temp;
    cin >> n >> m;

    int dp[n+1][n+1];
    for(int i=0; i<=n; i++){
        dp[0][i] = 0;
        dp[i][0] = 0;
    }

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cin >> temp;
            dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + temp;
        }
    }

    int x1, y1, x2, y2, ans;
    for(int i=0; i<m; i++){
        cin >> x1 >> y1 >> x2 >> y2;
        ans = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
        cout << ans << "\n";
    }
}