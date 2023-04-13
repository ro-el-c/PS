// Робинзон Крузо
#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    int n, a, b; cin >> n; a = n/5; b = n%5;
    for (int i=0; i<a; i++) cout << "V";
    for (int i=0; i<b; i++) cout << "I";
}