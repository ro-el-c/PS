// 줄 세우기
#include <iostream>
#include <vector>
#include <queue>
#define MAX_NODE 32001
using namespace std;

vector<int> edges[MAX_NODE];
queue<int> que;
int in_degree[MAX_NODE];
int n, m, cur;

void topological_sort() {
    for (int i=1; i<=n; i++)
        if (in_degree[i] == 0)
            que.push(i);
    
    while (!que.empty()) {
        cur = que.front();
        cout << cur << " ";
        que.pop();
        
        for (int nv : edges[cur]) {
            in_degree[nv]--;
            if (in_degree[nv] == 0) que.push(nv);
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    cin >> n >> m;
    int start, end;
    while (m--) {
        cin >> start >> end;
        edges[start].push_back(end);
        in_degree[end]++;
    }

    topological_sort();
}