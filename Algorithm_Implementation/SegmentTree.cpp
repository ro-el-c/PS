#include <iostream>
#include <cstdlib>
typedef long long ll;
using namespace std;

// 구간 합 구하기 - 세그먼트 트리

int N=10;
int tree[41]; // 최대 노드 개수(10) * 4
int arr[11] = {0, 7, 1, 3, 10, 8, 4, 5, 6, 2, 9};

void init(int node, int s, int e) {
    if(s==e) {tree[node]=arr[s]; return;}
    int mid = (s+e)/2;
    init(node<<1, s, mid);
    init(node<<1|1, mid+1, e);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void init(){
    init(1, 1, N);
}

// node가 담당하는 구간 [s, e], 구하고자 하는 구간 [l, r]
ll query(int node, int s, int e, int l, int r) {
    if(r < s || e < l) return 0;
    if(l <= s && e <= r) return tree[node];
    int mid = (s+e)/2;
    return query(node<<1, s, mid, l, r) + query(node<<1|1, mid+1, e, l, r); // 왼쪽 자식 + 오른쪽 자식
}
ll query(int l, int r) {
    return query(1, 1, N, l, r);
}

void update(int node, int s, int e, int idx, ll value) {
    if(idx < s || e < idx) return;
    if(s==e) {tree[node]=value; return;}
    int mid = (s+e)/2;
    update(node<<1, s, mid, idx, value);
    update(node<<1|1, mid+1, e, idx, value);
    tree[node] = tree[node<<1] + tree[node<<1|1];
}
void update(int idx, ll value){
    update(1, 1, N, idx, value);
}
/**
 * node*2 보다 node<<1이 더 빠름 / node*2+1 은 node<<1|1
 * 
 * node<<1|1은 node를 shift left 후, or 1
 * shift left 하면 1의 자리가 무조건 0이다. 이 때, 1과 or 연산을 하면 1의 자리가 1이 되므로, +1 연산과 같게 된다.
 */

int main() {
     // N=10 / 7, 1, 3, 10, 8, 4, 5, 6, 2, 9
    init();
    cout << query(2, 5) << "\n"; // 22
    update(4, 20);
    cout << query(2, 5) << "\n"; // 32
}