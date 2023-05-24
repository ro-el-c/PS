// 저울
#include <iostream>
using namespace std;

bool d[101][101] = {false, };

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n, m, a, b;
    cin >> n >> m;
    while(m--) {
        cin >> a >> b;
        d[b][a] = true; // a가 b보다 무겁다.
    }

    // Floyd-Warshall
    for(int k=1; k<=n; k++)
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                if(d[i][k] && d[k][j]) d[i][j] = true;

    for(int i=1; i<=n; i++) {
        int cnt=0;
        for(int j=1; j<=n; j++)
            if(i!=j && d[i][j] || d[j][i]) cnt++;
        cout << n-1-cnt << "\n";
    }

    return 0;
}