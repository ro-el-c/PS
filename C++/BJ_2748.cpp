// 피보나치 수 2
// long long

#include <iostream>
using namespace std;

int main(void) {
    int n;
    cin >> n;

    long long arr[91];
    arr[0] = 0;
    arr[1] = 1;

    for (int i = 2; i < 91; i++) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }

    cout << arr[n];
}