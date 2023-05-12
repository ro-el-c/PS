// 여행 가자
#include <iostream>
using namespace std;

int n, m;
int parent[201];

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

    int tmp;
    for (int i=1; i<=n; i++) {
        for (int j=1; j<=n; j++) {
            cin >> tmp;
            if (tmp) merge(i, j);
        }
    }

    cin >> tmp;
    int root = find(tmp);
    while(--m) {
        cin >> tmp;
        if(root != find(tmp)) {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
    return 0;
}