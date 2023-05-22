// 키 순서
#include <iostream>
using namespace std;

bool d[501][501]={false,};

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n, m, a, b;
    cin >> n >> m;
    while(m--){
        cin >> a >> b;
        d[a][b] = true;
    }

    // floyd-warshall
    for(int k=1; k<=n; k++)
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                if(d[i][k] && d[k][j]) d[i][j] = true;
    
    int ans=0;
    for(int i=1; i<=n; i++){
        int cnt=0;
        for(int j=1; j<=n; j++)
            if(d[i][j] || d[j][i]) cnt++;

        if(cnt==n-1) ans++;
    }

    cout << ans;
    return 0;
}