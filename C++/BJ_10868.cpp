// 최솟값
#include <iostream>
#include <algorithm>
#define endl "\n"
#define INF 10000000000
typedef long long ll;
using namespace std;

int n, m;
ll arr[100001];
ll tree[400001];

void init(int node, int s, int e){
    if(s==e){tree[node]=arr[s]; return;}
    int mid=(s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = min(tree[node<<1], tree[node<<1|1]);
}
void init(){init(1, 1, n);}

ll query(int node, int s, int e, int l, int r){
    if(r<s || e<l) return INF;
    if(l<=s && e<=r) return tree[node];
    int mid=(s+e)/2;
    return min(query(node<<1, s, mid, l, r), query(node<<1|1, mid+1, e, l, r));
}
ll query(int l, int r){return query(1, 1, n, l, r);}

int main(){
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n >> m;
    for(int i=1; i<=n; i++) cin >> arr[i];

    init();

    ll a, b;
    while(m--) {
        cin >> a >> b;
        cout << query(a, b) << endl;
    }

    return 0;
}