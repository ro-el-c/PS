// 개구리 점프
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct log_ {
    int x1, x2, idx;
    log_(int x1_, int x2_, int idx_): x1(x1_), x2(x2_), idx(idx_){};
    bool operator<(const log_& l) const {return x1 < l.x1;}; // x1에 대하여 오름차순 정렬
};

int parent[100001];
vector<log_> logs;

int find(int i) {
    if(parent[i] == i) return i;
    return parent[i] = find(parent[i]);
}

void merge(int a, int b) {
    parent[find(a)] = find(b);
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    int n, q, x1, x2, y;
    cin >> n >> q;
    for (int i=1; i<=n; i++) {
        cin >> x1 >> x2 >> y;
        logs.push_back(log_(x1, x2, i));
        parent[i] = i;
    }

    // 이동 가능한 통나무 묶기(하나의 집합으로 묶음)
    sort(logs.begin(), logs.end());
    auto& standard = logs[0];
    for(int i=1; i<n; i++) {
        auto& compare = logs[i];
        if (standard.x2 < compare.x1) standard = compare;
        else {
            merge(standard.idx, compare.idx);
            if(standard.x2 < compare.x2) standard = compare;
        }
    }

    // Q개의 질문
    while(q--) {
        int l1, l2;
        cin >> l1 >> l2;
        if (find(l1) == find(l2)) cout << 1 << "\n";
        else cout << 0 << "\n";
    }
}