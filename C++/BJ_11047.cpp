// 동전 0
#include <iostream>
#include <vector>
#include <algorithm>

typedef long long ll;
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, temp;
    ll k, sum = 0;
    vector<ll> vt;

    cin >> n >> k;

    for (int i = 0; i < n; i++) {
        cin >> temp;
        vt.push_back(temp);
    }
    sort(vt.begin(), vt.end(), greater<>());
    while (!vt.empty()) {
        sum += k / vt.at(0);
        k %= vt.at(0);
        vt.erase(vt.begin());
    }
    cout << sum;
}