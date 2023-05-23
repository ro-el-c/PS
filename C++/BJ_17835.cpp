// 면접보는 승범이네
#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;
typedef long long ll;

#define INF 50000000010

ll n, m, k;

vector<pair<ll, ll>> vertex[100001];
ll dist[100001];
priority_queue<pair<ll, ll>> pq;

void dijkstra() {
    for(int i=0; i<=n; i++) dist[i]=INF;

    pq.emplace(0, 0);
    dist[0]=0;

    while(!pq.empty()) {
        auto [cur_dist, cur] = pq.top(); pq.pop();
        cur_dist *= -1;

        if(cur_dist > dist[cur]) continue;

        for(auto& [next, next_cost] : vertex[cur]) {
            ll ncost = cur_dist + next_cost;

            if(ncost < dist[next]) {
                dist[next] = ncost;
                pq.emplace(-ncost, next);
            }
        }
    }
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n >> m >> k;
    int a, b, c;
    while(m--) {
        cin >> a >> b >> c;
        vertex[b].push_back(make_pair(a, c));
    }

    int temp;
    while(k--) {
        cin >> temp;
        vertex[0].push_back(make_pair(temp, 0));
    }

    dijkstra();

    ll max_cost=0, max_idx;
    for(int i=1; i<=n; i++)
        if(max_cost < dist[i]) {
            max_cost = dist[i];
            max_idx = i;
        }

    cout << max_idx << "\n" << max_cost;
    return 0;
}