// 구간 합 구하기
#include <iostream>
typedef long long ll;
using namespace std;

int n, m, k, change;
ll arr[1000001];
ll tree[4000001];

void init(int node, int s, int e){
    if(s==e) {tree[node] = arr[s]; return;}
    int mid=(s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void init(){
    init(1, 1, n);
}

ll query(int node, int s, int e, int l, int r){ 
    if(r<s || e<l) return 0;
    if(l<=s && e<=r) return tree[node];
    int mid=(s+e)/2;
    return query(node<<1, s, mid, l, r) + query(node<<1|1, mid+1, e, l, r);
}
ll query(int l, int r){
    return query(1, 1, n, l, r);
}

void update(int node, int s, int e, int idx, ll value){
    if(idx<s || e<idx) return;
    if(s==e) {tree[node]=value; return;}
    int mid=(s+e)/2;
    update(node<<1, s, mid, idx, value);
    update(node<<1|1, mid+1, e, idx, value);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void update(int idx, ll value){
    update(1, 1, n, idx, value);
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n >> m >> k;
    for(int i=1; i<=n; i++) cin >> arr[i];
    
    init();

    change = m+k;
    ll oper, a, b;
    while(change--) {
        cin >> oper >> a >> b;
        if(oper == 1) update(a, b);
        else cout << query(a, b) << "\n";
    }

    return 0;
}