// 성싶당 밀키트

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
typedef long long ll;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    ll g;
    ll lo=0, hi=2000000001;
    ll arr[200001][3] = { 0 };

    cin >> n >> g >> k;

    for (int i = 0; i < n; i++) cin >> arr[i][0] >> arr[i][1] >> arr[i][2]; // si, li, oi

    ll ans=0;
    while (lo <= hi) {
        ll mid = (lo + hi) / 2; // 경과한 날짜

        vector<ll> vt; // 제외 가능한 재료의 세균 수 -> 저장 수 내림차순 정렬 -> 최대 k개까지 세균의 수에서 제외
        ll germ = 0; // 세균 수
        for (int i = 0; i < n; i++){
            ll temp = arr[i][0] * max(1LL, mid - arr[i][1]);
            germ += temp;
            if(arr[i][2] == 1) vt.push_back(temp);
        }
        sort(vt.begin(), vt.end(), greater<ll>());

        for(int i = 0; i < min(k, int(vt.size())); i++) germ -= vt[i];

        if(germ <= g) {
            ans = max(ans, mid);
            lo = mid + 1;
        }
        else hi = mid - 1;
    }
    
    cout << ans;
}