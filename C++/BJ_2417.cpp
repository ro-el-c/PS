// 정수 제곱근
// n을 입력 받았을 때, q^2 ≥ n인 가장 작은 음이 아닌 정수 q를 출력

#include <cmath>
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    long long n, ans;
    cin >> n;
    ans = sqrt(n);

    while (pow(ans, 2) < n)
        ans++;

    cout << ans;
}