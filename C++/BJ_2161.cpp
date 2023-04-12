#include <iostream>
#include <queue>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    int n; cin >> n;
    queue<int> que;
    for (int i=1; i<=n; i++) que.push(i);

    while(que.size() > 1) {
        cout << que.front() << " ";
        que.pop();
        que.push(que.front());
        que.pop();
    }

    cout << que.front();
}