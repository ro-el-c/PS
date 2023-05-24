// 허들 넘기
#include <iostream>
#include <algorithm>
using namespace std;

#define INF 10000000
int d[301][301];

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n, m, t;
    cin >> n >> m >> t;
    for(int i=1; i<=n; i++)
        for(int j=1; j<=n; j++) {
            if(i==j) continue;
            d[i][j] = INF;
        }

    int u, v, h;
    while(m--) {
        cin >> u >> v >> h;
        d[u][v] = h;
    }

    // Floyd-Warshall
    for(int k=1; k<=n; k++)
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                d[i][j] = min(d[i][j], max(d[i][k], d[k][j]));
    /**
     * i 노드에서 j 노드로 갈 때,
     * 원래의 경로에서 허들의 최댓값과 k 노드를 경유하는 경로에서 허들의 최댓값을 비교하여 작은 값을 저장
     */
    
    int s, e;
    while(t--) {
        cin >> s >> e;
        cout << (d[s][e] < INF ? d[s][e] : -1) << "\n";
    }

    return 0;
}