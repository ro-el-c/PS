// 트리의 지름
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
typedef long long ll;

vector<pair<int, int>> edges[100001]; // 정점, 가중치
ll dist[100001];
bool visited[100001];
ll maxIdx, maxDist;

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
    ll N, start, end, weight;
    cin >> N;

    for(int i=0; i<N; i++) {
        cin >> start;
        while(true){
            cin >> end;
            if(end == -1) break;
            cin >> weight;
            edges[start].push_back(make_pair(end, weight));
            edges[end].push_back(make_pair(start, weight));
        }
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