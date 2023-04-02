// 영수증
#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int total, n;
    cin >> total >> n;
    
    int price, num, sum=0;
    for (int i=0; i<n; i++){
        cin >> price >> num;
        sum += price * num;
    }

    cout << (sum == total ? "Yes" : "No");
}