// 사탕상자
#include <iostream>
#define endl "\n"
typedef long long ll;
using namespace std;

int n = 1000000;
ll tree[4000001]={0,};

ll query(int node, int s, int e, int cnt){
    if(s==e) return s;

    int mid=(s+e)/2;
    ll left = tree[node<<1];
    ll right = tree[node<<1|1];
    if(cnt <= left) {
        return query(node<<1, s, mid, cnt);
    }else {
        cnt -= left;
        return query(node<<1|1, mid+1, e, cnt);
    }
}
ll query(int cnt){
    return query(1, 1, n, cnt);
}

void update(int node, int s, int e, int idx, ll value){
    if(idx<s || e<idx) return;
    if(s==e && s==idx) {tree[node]+=value; return;} // 리프 노드 업데이트
    
    int mid=(s+e)/2;
    update(node<<1, s, mid, idx, value);
    update(node<<1|1, mid+1, e, idx, value);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void update(int idx, ll value){update(1, 1, n, idx, value);}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n;
    cin >> n;

    int oper, a, b;
    while(n--) {
        cin >> oper;
        if(oper==1) {
            cin >> a;
            int ans = query(a);
            cout << ans << endl;
            update(ans, -1);
            }
        else {
            cin >> a >> b; 
            update(a, b);
        }
    }

    return 0;
}

/*
A, B  or  A, B, C

// query -> 안에서 update
A=1: 사탕상자에서 B 순위의 사탕을 1개 꺼낸다.

// update
A=2: 사탕상자에 B 맛의 사탕 C개를 넣는다.
    1. C 양수 - 사탕을 넣는 경우
    2. C 음수 - 사탕을 빼는 경우
*/