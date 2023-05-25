// 최솟값과 최댓값
#include <iostream>
#include <vector>
#include <algorithm>
#define INF 10000000000
#define endl "\n"
#define space " "
typedef long long ll;
using namespace std;

int n, m;
ll arr[100001];
ll minTree[400001];
ll maxTree[400001];

void init(int node, int s, int e){
    if(s==e){
        minTree[node] = arr[s]; maxTree[node] = arr[s];
        return;
    }

    int mid=(s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    minTree[node] = min(minTree[node<<1], minTree[node<<1|1]);
    maxTree[node] = max(maxTree[node<<1], maxTree[node<<1|1]);
}
void init(){init(1, 1, n);}

pair<ll, ll> query(int node, int s, int e, int l, int r){
    if(r<s || e<l) return make_pair(INF, -INF);
    if(l<=s && e<=r) return make_pair(minTree[node], maxTree[node]);

    int mid=(s+e)/2;
    pair<ll, ll> t1 = query(node<<1, s, mid, l, r);
    pair<ll, ll> t2 = query(node<<1|1, mid+1, e, l, r);
    return make_pair(min(t1.first, t2.first), max(t1.second, t2.second));
}
pair<ll, ll> query(int l, int r){return query(1, 1, n, l, r);}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n >> m;
    for(int i=1; i<=n; i++) cin >> arr[i];
    
    init();

    ll a, b;
    pair<ll, ll> temp;
    while(m--) {
        cin >> a >> b;
        temp = query(a, b);
        cout << temp.first << space << temp.second << endl;
    }

    return 0;
}

/**
 * init할 때부터 tree를 vector<pair<int, int>>으로 저장하려고 시도했으나 실패..ㅜ

=>
vector<pair<ll, ll>> tree; // <최솟값, 최댓값>
void init(int node, int s, int e){
    if(s==e){tree[node] = make_pair(arr[s], arr[s]); return;}
    int mid=(s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = make_pair(min(tree[node<<1].first, tree[node<<1|1].first), max(tree[node<<1].second, tree[node<<1|1].second));
}
void init(){init(1, 1, n);}*/