// DFS와 BFS
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

vector<int> edges[1001];
bool visited[1001];

void dfs(int v) {
    visited[v] = true;
    cout << v << " ";

    for(int nv : edges[v]) {
        if (!visited[nv]) dfs(nv);
    }
}

void bfs(int v) {
    queue<int> que;
    que.push(v); // 큐에 push함에 동시에
    visited[v] = true; // 해당 노드의 방문 표시

    while(!que.empty()) {
        int cur = que.front();
        que.pop();
        cout << cur << " ";

        for(int nv : edges[cur]) {
            if(!visited[nv]) {
                que.push(nv);
                visited[nv] = true;
            }
        }
    }

}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    int n, m, v;
    cin >> n >> m >> v;
    
    int temp1, temp2;
    while(m--) {
        cin >> temp1 >> temp2;
        edges[temp1].push_back(temp2);
        edges[temp2].push_back(temp1);
    }

    // 방문할 수 있는 정점이 여러 개인 경우, 정점 번호가 작은 것을 먼저 방문
    for(int i=1; i<=n; i++) sort(edges[i].begin(), edges[i].end());

    dfs(v);
    cout << "\n";
    fill(visited, visited+n+1, false);
    bfs(v);
}