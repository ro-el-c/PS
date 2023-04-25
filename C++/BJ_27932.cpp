// 어깨동무
#include <iostream>
#include <vector>
#include <cstdlib>
#include <algorithm>
#include <climits>

typedef long long ll;

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n >> k;

    vector<ll> vt(n);
    for (int i = 0; i < n; i++) cin >> vt[i];

    if (n==1){
        cout << 0;
        return 0;
    }

    // 키 차이 저장
    vector<pair<ll, ll>> sub(n);
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            sub[i] = make_pair(0, abs(vt[0] - vt[1]));
        } else if (i == n - 1) {
            sub[i] = make_pair(abs(vt[n - 2] - vt[n - 1]), 0);
        } else {
            sub[i] = make_pair(abs(vt[i - 1] - vt[i]), abs(vt[i] - vt[i + 1]));
        }
    }

    ll lo = 0, hi = INT_MAX;
    ll h = INT_MAX;
    while (lo <= hi) {
        ll mid = (lo + hi) / 2;

        int temp = 0;
        for (int i = 0; i < n; i++)
            if (sub[i].first > mid || sub[i].second > mid) temp += 1;

        if (temp > k)
            lo = mid+1;
        else {
            hi = mid-1;
            h = min(h, mid);
        }
    }

    cout << h;
}

/*
99퍼 틀렸습니다

n=1 인 경우, 답은 무조건 0
*/
