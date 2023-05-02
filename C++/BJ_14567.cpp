// 선수 과목
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#define MAX_NODE 1001
using namespace std;

vector<int> edges[MAX_NODE];
pair<int, int> cur_v;
int semester_cnt[MAX_NODE];
queue<pair<int, int>> que;
int in_degree[MAX_NODE] = {0, };
int n, m, a, b, temp_cnt;

void topological_sort() {
    int cnt=1;

    for (int i=1; i<=n; i++)
        if (in_degree[i] == 0) {
            que.push(make_pair(i, cnt));
            semester_cnt[i] = cnt;
        }
    
    while (!que.empty()) {
        cur_v = que.front();
        que.pop();
        cnt = cur_v.second;

        for (int nv : edges[cur_v.first]) {
            in_degree[nv]--;
            if (in_degree[nv] == 0) {
                que.push(make_pair(nv, cnt+1));
                semester_cnt[nv] = cnt+1;
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    cin >> n >> m;
    while (m--) {
        cin >> a >> b;
        edges[a].push_back(b);
        in_degree[b]++;
    }

    topological_sort();
    for (int i=1; i<=n; i++) cout << semester_cnt[i] << " ";
}

/**
 * queue에 노드 번호와 몇 번째 학기인지를 저장하는데, semester 배열을 추가로 하나 더 두는 이유
 * 
 * semester 배열은 최종 배열의 값
 *
 * queue에 저장되는 학기 정보는 이전 노드의 학기 수 + 1
 * 뒤에서 새로이 갱신될 수 있음
 * -> 위상 정렬은 순서를 지켜 수행되기 때문에, 뒤에서 갱신될 수록 작은 값을 가짐
 */