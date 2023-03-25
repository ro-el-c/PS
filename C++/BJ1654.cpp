// 랜선 자르기

#include <iostream>
#include <vector>
using namespace std;
typedef long long ll;

int main() {
    int k, n;
    cin >> k >> n;

    ll hi = 0;
    vector<ll> arr(k);
    for (int i = 0; i < k; i++) {
        cin >> arr[i];
        if (hi < arr[i]) hi = arr[i];
    }

    ll lo = 1;
    while (lo <= hi) {
        ll mid = (lo + hi) / 2;
        int cnt = 0;

        for (int i = 0; i < arr.size(); i++) cnt += arr[i] / mid;
        if(cnt < n) hi = mid-1;
        if(cnt >= n) lo = mid+1;
    }

    cout << hi;
}