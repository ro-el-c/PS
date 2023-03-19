// 수열의 합 2
// 시간 제한 0.5초

#include <iostream>
#include <vector>
using namespace std;
typedef long long ll;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    ll n, m, start = 0, end = 0;
    cin >> n >> m;

    vector<ll> arr;
    ll temp;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        arr.push_back(temp);
    }

    ll sum = arr[start];
    ll cnt = 0;
    while (end < n) {
        if (sum <= m) {
            if (sum == m) {
                cnt++;
            }
            sum += arr[++end];
        } else {
            sum -= arr[start++];
            if (start > end) {
                end = start;
                sum = arr[start];
            }
        }
    }

    cout << cnt;
    return 0;
}