// N과 M (5)
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N, M;
vector<int> vt(8);
int ans[8];
bool visited[8];

void solve(int depth) {
    if(depth == M){
        for(int i=0; i<M; i++) cout << ans[i] << " ";
        cout << "\n";
        return;
    }

    for(int i=0; i<N; i++) {
        if(!visited[i]) {
            visited[i] = true; // 서로 다른 수
            ans[depth] = vt[i];
            solve(depth + 1);
            visited[i] = false;
        }
    }
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> N >> M;
    vt.resize(N);

    for(int i=0; i<N; i++) cin >> vt[i];
    
    sort(vt.begin(), vt.end()); // 사전 순서
    solve(0);

    return 0;
}