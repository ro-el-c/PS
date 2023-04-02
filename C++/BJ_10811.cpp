// 바구니 뒤집기
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> vt(n+1);
    for (int i = 1; i <= n; i++) {
        vt[i] = i;
    }

    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        reverse(vt.begin()+a, vt.end()-n+b);
    }

    for (int i = 1; i < vt.size(); i++) cout << vt[i] << " ";
}