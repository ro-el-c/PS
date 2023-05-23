// 운동
#include <iostream>
#include <algorithm>
using namespace std;

#define INF 987654321

int d[401][401];

int main() {
    int v, e, a, b, c;
    cin >> v >> e;

    for(int i=1; i<=v; i++)
        for(int j=1; j<=v; j++)
            d[i][j] = INF;

    while(e--) {
        cin >> a >> b >> c;
        d[a][b] = c;
    }
    
    // Floyd-Warshall
    for(int k=1; k<=v; k++)
        for(int i=1; i<=v; i++)
            for(int j=1; j<=v; j++)
                d[i][j] = min(d[i][j], d[i][k]+d[k][j]);

    int min_cycle=INF;
    for(int i=1; i<=v; i++)
        for(int j=1; j<=v; j++) {
            if(i!=j && d[i][j]<INF && d[i][j]<INF)
                min_cycle = min(min_cycle, d[i][j]+d[j][i]);
        }
    
    cout << (min_cycle < INF ? min_cycle : -1);
    return 0;
}