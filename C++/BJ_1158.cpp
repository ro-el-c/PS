#include <iostream>
#include <queue>
using namespace std;

int main() {
    int n, k;
    queue<int> que;
    cin >> n >> k;

    for (int i = 1; i <= n; i++) {
        que.push(i);
    }

    cout << "<";
    while (!que.empty()) {
        for (int i = 0; i < k - 1; i++) {
            que.push(que.front());
            que.pop();
        }

        cout << que.front();
        que.pop();


        if (que.size() == 0) {
            cout << ">";
        } else {
            cout << ", ";
        }
    }
}