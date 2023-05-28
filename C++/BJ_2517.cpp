// 달리기
#include <iostream>
#include <algorithm>
#define endl "\n"
typedef long long ll;
using namespace std;

int n;
vector<pair<ll, ll>> arr;
ll tree[2000001]={0,};

bool compare(pair<ll, ll> a, pair<ll, ll> b){ // 입력 순서대로 재정렬할 때 사용
    return a.second < b.second;
}

void init() { // 좌표 압축
    sort(arr.begin(), arr.end());
    for(int i=1; i<=n; i++) arr[i].first = i;
    sort(arr.begin(), arr.end(), compare);
}

ll query(int node, int s, int e, int l, int r) {
    if(r<s || e<l) return 0;
    if(l<=s && e<=r) return tree[node];

    int mid=(s+e)/2;
    return query(node<<1, s, mid, l, r) + query(node<<1|1, mid+1, e, l, r);
}
ll query(int now) {return query(1, 1, n, now+1, n);}

void update(int node, int s, int e, int idx){
    if(idx<s || e<idx) return;
    if(s==e && s==idx) {tree[node]=1; return;}

    int mid=(s+e)/2;
    update(node<<1, s, mid, idx);
    update(node<<1|1, mid+1, e, idx);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void update(int idx) {update(1, 1, n, idx);}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    cin >> n; arr.resize(n+1);

    int temp;
    for(int i=1; i<=n; i++) {
        cin >> temp;
        arr[i] = {temp, i};
    }

    init();
    /**
     * arr에 <평소 기량, 현재 등수>가 저장되어 있다.
     * 
     * 리프 노드에는 각 기량을 가진 선수가 앞에 있는지 여부가 작성되어 있다.
     * -> 1등부터 선수부터 n등 선수까지 순서대로 탐색하면서 하나씩 1로 갱신된다.
     *    어떤 값이 갱신되는가? = 탐색한 선수의 평소 기량을 s이자 e로 가지는 리프 노드
     * 
     * 리프 노드를 제외한 모드 노드에는 자신이 담당하는 구간의 합이 저장되어 있다.
     */

    int now;
    for(int i=1; i<=n; i++) {
        now = arr[i].first;
        cout << query(now)+1 << endl;
        update(now);
    }

    return 0;
}