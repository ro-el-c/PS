// 특정한 최단 경로
#include <iostream>
#include <vector>
#include <queue>
#include <cstring>
#include <algorithm>
using namespace std;

#define MAX_NODE 801
#define INF 987654321

int N, E, a, b, w;
vector<pair<int, int>> vertex[MAX_NODE]; // 연결 노드, 가중치
int dist[MAX_NODE];
priority_queue<pair<int, int>> pq; // 가중치, 도착 노드

void dijkstra(int start) {
    for(int i=1; i<=N; i++) dist[i] = INF;

    pq.emplace(0, start);
    dist[start] = 0;

    while(!pq.empty()) {
        auto [cur_dist, cur] = pq.top(); pq.pop();
        cur_dist *= -1;

        if(cur_dist > dist[cur]) continue;

        for(auto& [next, next_cost] : vertex[cur]) { // 연결된 정점 거리 갱신
            int ncost = cur_dist + next_cost;

            if(ncost < dist[next]) {
                dist[next] = ncost;
                pq.emplace(-ncost, next);
            }
        }
    }
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> N >> E;
    while(E--) {
        cin >> a >> b >> w;
        vertex[a].push_back(make_pair(b, w));
        vertex[b].push_back(make_pair(a, w));
    }

    int v1, v2;
    cin >> v1 >> v2;

    int tov1, tov2, v1tov2, v1toN, v2toN;
    dijkstra(v1);
    tov1 = dist[1];
    v1tov2 = dist[v2];
    v1toN = dist[N];
    dijkstra(v2);
    tov2 = dist[1];
    v2toN = dist[N];

    long long distance = min(tov1 + v1tov2 + v2toN, tov2 + v1tov2 + v1toN);
    cout << ((distance > 0 && distance < INF) ? distance : -1);

    return 0;
}
