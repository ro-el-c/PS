// 히스토그램
#include <iostream>
#include <algorithm>
using namespace std;

int n;
int arr[100001];
int tree[400001];

void init(int node, int s, int e){ // 각 구간에서 최소 높이를 가지는 인덱스 저장
    if(s==e){tree[node] = s; return;}
    int mid = (s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = arr[tree[node<<1]] <= arr[tree[node<<1|1]] ? tree[node<<1] : tree[node<<1|1];
}
void init(){init(1, 1, n);}

int query(int node, int s, int e, int l, int r){ // [l, r] 구간의 최소 높이를 가지는 인덱스 반환
    if(r<s || e<l) return -1;
    if(l<=s && e<=r) return tree[node];
    int mid = (s+e)/2;
    int t1 = query(node<<1, s, mid, l, r);
    int t2 = query(node<<1|1, mid+1, e, l, r);
    if(t1 == -1) return t2;
    if(t2 == -1) return t1;
    return arr[t1] <= arr[t2] ? t1 : t2;
}
int query(int l, int r){return query(1, 1, n, l, r);}

int solve(int s, int e){
    int minIdx = query(s, e);
    int maxArea = arr[minIdx] * (e-s+1);
    if(s < minIdx) maxArea = max(maxArea, solve(s, minIdx-1));
    if(minIdx < e) maxArea = max(maxArea, solve(minIdx+1, e));
    return maxArea;
}

int main(){
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> n;
    for(int i=1; i<=n; i++) cin >> arr[i];

    init();
    cout << solve(1, n);

    return 0;
}