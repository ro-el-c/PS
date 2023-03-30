// 구간 합 구하기 4
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, temp;
    cin >> n >> m;

    int arr[n+1];
    arr[0] = 0;

    for(int i=1; i<=n; i++){
        cin >> temp;
        arr[i] = arr[i-1] + temp;
    }

    int small, big;
    for(int i=0; i<m; i++){
        cin >> small >> big;
        cout << arr[big]-arr[small-1] << "\n";
    }
}