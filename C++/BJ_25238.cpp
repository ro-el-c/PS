// 가희와 방어율 무시
#include <iostream>
using namespace std;

int main(){
    double a, b; cin >> a >> b;
    double result = a * ((100-b)/100);
    cout << (result < 100 ? 1 : 0);
}