// 쉽게 푸는 문제

#include <iostream>
using namespace std;

int main(void) {
    int a, b;

    cin >> a >> b;

    int arr[1001];
    int k = 0;

    for (int i = 1; i < 1001; i++) {
        for (int j = 0; j < i & k < 1001; j++) {
            arr[k] = i;
            k++;
        }
    }

    int res = 0;

    for (int i = a - 1; i < b; i++) {
        res += arr[i];
    }

    cout << res;
}