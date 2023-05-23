// 최소비용 구하기 2
#include <iostream>
#include <cstring>
#include <vector>
#include <queue>
using namespace std;

#define INF 1000000000

int n, m;

vector<pair<int, int>> vertex[1001]; // 도착 노드, 가중치
priority_queue<pair<int, int>> pq; // 가중치, 도착 노드
int dist[1001];
int route[1001];

void dijkstra(int start) {
    for(int i=1; i<=n; i++) dist[i]=INF;

    pq.emplace(0, start);
    dist[start] = 0;

    while(!pq.empty()) {
        auto [cur_dist, cur] = pq.top(); pq.pop();
        cur_dist *= -1;
        if(cur_dist > dist[cur]) continue;
        
        for(auto& [next, next_cost] : vertex[cur]) {
            int ncost = cur_dist + next_cost;

            if(ncost < dist[next]) {
                route[next] = cur; // 경유 루트 저장
                dist[next] = ncost;
                pq.emplace(-ncost, next);
            }
        }
    }
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int a, b, c, start, end;
    cin >> n >> m;
    while(m--) {
        cin >> a >> b >> c;
        vertex[a].push_back(make_pair(b, c));
    }
    
    cin >> start >> end;
    dijkstra(start);

    // 최소 비용
    cout << dist[end] << "\n";

    int temp = end;
    vector<int> ans_route;
    while(temp != 0) {
        ans_route.push_back(temp);
        temp = route[temp];
    }

    // 방문 도시 개수
    cout << ans_route.size() << "\n";

    // 도시 방문 순서
    for(int i=ans_route.size()-1; i>=0; i--) cout << ans_route[i] << " ";
}