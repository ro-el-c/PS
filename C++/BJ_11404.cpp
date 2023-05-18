// 플로이드
#include <iostream>
#include <algorithm>
#define INF 10000001 // 100 * 100000 보다 큰 값
using namespace std;

int d[101][101];

int main() {
    for(int i=0; i<101; i++) 
        for(int j=0; j<101; j++)
            if(i != j) d[i][j] = INF;

    int n, m, a, b, c;
    cin >> n >> m;
    while(m--) {
        cin >> a >> b >> c;
        d[a][b] = min(d[a][b], c);
    }
    // floyd-warshall
    for(int k=1; k<=n; k++)
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                d[i][j] = min(d[i][j], d[i][k] + d[k][j]);
    
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=n; j++) {
            if(d[i][j] == INF) cout << 0;
            else cout << d[i][j];
            cout << " ";
        }
        cout << "\n";
    }
    return 0;
}