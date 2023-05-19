// 트리의 지름
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N, a, b, c;
vector<pair<int, int>> edges[10001]; // 정점, 가중치
int dist[10001];
bool visited[10001];
int maxIdx, maxDist;

void dfs(int v) {
    visited[v] = true;
    for(auto [next, next_dist] : edges[v]) {
        if(!visited[next]){
            dist[next] = dist[v] + next_dist;
            if(dist[next] > maxDist) {
                maxDist = dist[next];
                maxIdx = next;
            }
            dfs(next);
        }
    }
}

int main() {
    cin >> N;
    for(int i=1; i<N; i++) {
        cin >> a >> b >> c;
        edges[a].push_back(make_pair(b, c));
        edges[b].push_back(make_pair(a, c));
    }
    dfs(1);
    for(int i=1; i<=N; i++) {
        dist[i] = 0;
        visited[i] = false;
    }
    dfs(maxIdx);
    cout << maxDist;

    return 0;
}