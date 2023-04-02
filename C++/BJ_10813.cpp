// 공 바꾸기
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, a, b;
    cin >> n >> m;
    int arr[n+1];
    for (int i=1; i<=n; i++) arr[i] = i;
    for (int i=0; i<m; i++){
        cin >> a >> b;
        swap(arr[a], arr[b]);
    }

    for(int i=1; i<=n; i++) cout << arr[i] << + " ";
}