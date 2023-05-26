// 수열과 쿼리 16
#include <iostream>
#include <algorithm>
#define INF 1e10
#define endl "\n"
typedef long long ll;
using namespace std;

int n, m;
ll arr[100001];
ll tree[400001];

// tree에 최솟값을 가지는 인덱스를 저장

int getMinIdx(int a, int b) {
    if(arr[a] == arr[b]) return a < b ? a : b;
    return arr[a] < arr[b] ? a : b;
}

void init(int node, int s, int e){
    if(s==e) {tree[node]=s; return;}
    int mid=(s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = getMinIdx(tree[node<<1], tree[node<<1|1]);
}
void init(){init(1, 1, n);}

ll query(int node, int s, int e, int l, int r){
    if(r<s || e<l) return 0;
    if(l<=s && e<=r) return tree[node];
    int mid=(s+e)/2;
    return getMinIdx(query(node<<1, s, mid, l, r), query(node<<1|1, mid+1, e, l, r));
}
ll query(int l, int r){return query(1, 1, n, l, r);}

void update(int node, int s, int e, int idx){
    if(idx<s || e<idx || s==e) return;
    int mid=(s+e)/2;
    update(node<<1, s, mid, idx);
    update(node<<1|1, mid+1, e, idx);
    tree[node] = getMinIdx(tree[node<<1], tree[node<<1|1]);
}
void update(int idx){update(1, 1, n, idx);}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n;
    for(int i=1; i<=n; i++) cin >> arr[i];
    arr[0]=INF;

    init();

    cin >> m;
    int oper, a, b;
    while(m--) {
        cin >> oper >> a >> b;
        if(oper == 1) {arr[a]=b; update(a);}
        else cout << query(a, b) << endl;
    }

    return 0;
}