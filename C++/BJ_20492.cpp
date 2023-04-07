// 세금
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, a, b;
    cin >> n;
    a = n*0.78;
    b = n*0.8 + n*0.2*0.78;
    cout << a << " " << b;
}