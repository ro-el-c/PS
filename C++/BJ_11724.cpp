// 연결 요소의 개수
#include <iostream>
#include <vector>
using namespace std;

vector<int> edges[1001];
bool visited[1001] = {false,};

void dfs(int v) {
    visited[v] = true;
    for (int nv : edges[v]) {
        if(!visited[nv]) dfs(nv);
    }
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);

    int n, m, ans=0;
    cin >> n >> m;

    if(m==0){
        cout << n;
        return 0;
    }

    int t1, t2;
    while(m--) {
        cin >> t1 >> t2;
        edges[t1].push_back(t2);
        edges[t2].push_back(t1);
    }

    for(int i=1; i<=n; i++) {
        if(!visited[i]) {
            dfs(i);
            ans++;
        }
    }
    cout << ans;
}