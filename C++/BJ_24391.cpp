// 귀찮은 해강이
#include <iostream>
using namespace std;

int n, m;
int parent[100001];

int find(int i) {
    if(parent[i] == i) return i;
    parent[i] = find(parent[i]);
    // path compression: parent 배열의 값을 자신이 속한 집합의 루트 노드 값으로 갱신
    return parent[i];
}

void merge(int a, int b) {
    a = find(a);
    b = find(b);
    parent[a] = b;
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);

    cin >> n >> m;
    for (int i=1; i<=n; i++) parent[i] = i;

    int t1, t2;
    for (int i=0; i<m; i++) {
        cin >> t1 >> t2;
        merge(t1, t2);
    }

    int tmp;
    cin >> tmp;
    int root = find(tmp), cnt=0;
    while(--n) {
        cin >> tmp;
        if(root != find(tmp)) {
            cnt++;
            root = find(tmp);
        }
    }
    cout << cnt;
    return 0;
}