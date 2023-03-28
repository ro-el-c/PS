// 날카로운 눈
#include <iostream>
#include <algorithm>
#include <vector>
#include <tuple>
using namespace std;
typedef long long ll;

ll n, a, b, c;
vector<tuple<ll, ll, ll>> vt;
ll hi = ll(__INT_MAX__)+1, lo = 0;

ll sum(ll mid){
    ll cnt = 0;
    for(int i=0; i<n; i++){  
        if(ll(mid) >= get<0>(vt[i])) cnt += (min(mid, get<1>(vt[i])) - get<0>(vt[i]))/get<2>(vt[i]) + 1;
    }
    return cnt;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a >> c >> b;
        vt.push_back(make_tuple(a, c, b));
    }

    ll ans = ll(__INT_MAX__) + 1;
    while(lo < hi){
        ll mid = (lo + hi) / 2;
        ll cnt = sum(mid);

        if (cnt%2 != 0) {
            hi = mid;
            ans = min(ans, mid);
        }
        else lo = mid+1;
    }

    if(ans == ll(__INT_MAX__) + 1) cout << "NOTHING";
    else cout << ans << " " << sum(ans) - sum(ans-1);
}