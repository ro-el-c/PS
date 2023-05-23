// 최소 스패닝 트리
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct edge{
    int u, v, w;
    edge(int u_, int v_, int w_): u(u_), v(v_), w(w_){};
    bool operator< (const edge& e) const {return w < e.w;};
};

int parent[10001];
int v, e;

int find(int i) {
    if(parent[i]==i) return i;
    return parent[i]=find(parent[i]);
}

void merge(int a, int b) {
    parent[find(a)] = find(b);
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> v >> e;
    for(int i=1; i<=v; i++) parent[i]=i;

    vector<edge> edges;
    int a, b, c;
    while(e--) {
        cin >> a >> b >> c;
        edges.push_back(edge(a, b, c));
    }
    sort(edges.begin(), edges.end());

    int ans=0;
    for(int i=0; i<edges.size(); i++) {
        auto& [u, v, w] = edges[i];
        
        int t1, t2;
        t1 = find(u); t2 = find(v);
        if(t1==t2) continue;

        merge(u, v);
        ans += w;
    }
    
    cout << ans;
}