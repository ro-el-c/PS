// 중량제한
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct edge{
    int u, v, w;
    edge(int u_, int v_, int w_): u(u_), v(v_), w(w_){};
    bool operator<(const edge& e) const{return w > e.w;}; // 가중치에 대하여 내림차순 정렬
};

int parent[10001];
vector<edge> edges;

int find(int i) {
    if(parent[i] == i) return i;
    return parent[i] = find(parent[i]);
}

void merge(int a, int b) {
    parent[find(a)] = find(b);
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n, m;
    cin >> n >> m;
    for(int i=0; i<n; i++) parent[i]=i;
    
    while(m--) {
        int u, v, w;
        cin >> u >> v >> w;
        edges.push_back(edge(u, v, w));
    }

    int start, end;
    cin >> start >> end;

    sort(edges.begin(), edges.end());
    for(auto temp : edges) {
        merge(temp.u, temp.v);
        if(find(start) == find(end)) {
            cout << temp.w;
            return 0;
        }
    }
}