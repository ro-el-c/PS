// 피보나치 수 7
#include <iostream>
using namespace std;

int arr[1000001];

int main(){
    int n;
    cin >> n;
    
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2; i<=n; i++) arr[i] = (arr[i-1] + arr[i-2]) % 1000000007;

    cout << arr[n];
}