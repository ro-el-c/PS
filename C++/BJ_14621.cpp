// 나만 안되는 연애
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct edge {
    int u, v, d;
    edge(int u_, int v_, int d_): u(u_), v(v_), d(d_){};
    edge(): u(0), v(0), d(0){};
    bool operator< (const edge& e) const{return d < e.d;};
};

char gender[1001];
int parent[1001];
bool visited[1001] = {false, };

int find(int t) { // 정점의 연결 여부 확인
    if (parent[t] == t) return t;
    return parent[t] = find(parent[t]); // path compression
}

void merge(int a, int b) { // 정점 연결
    parent[find(a)] = find(b);
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    
    int n, m;
    cin >> n >> m;
    for(int i=1; i<=n; i++) {
        cin >> gender[i];
        parent[i] = i; // make_set
    }

    vector<edge> edges;
    while(m--) {
        int u, v, d;
        cin >> u >> v >> d;
        if (gender[u] == gender[v]) continue;
        edges.push_back(edge(u, v, d));
    }

    // Kruskal 알고리즘
    sort(edges.begin(), edges. end());
    int ans=0, cnt=0;
    for (int i=0; i<edges.size(); i++) {
        auto& [u, v, d] = edges[i];

        int t1, t2;
        t1 = find(u); t2 = find(v);

        if(t1 == t2) continue; // 이미 연결되어 있는 두 정점인 경우
        merge(u, v);

        if(!visited[u]) {
            visited[u] = true; cnt++;
        }
        if(!visited[v]) {
            visited[v] = true; cnt++;
        }

        ans += d;
    }

    if(cnt == n) cout << ans;
    else cout << -1;
    return 0;
}