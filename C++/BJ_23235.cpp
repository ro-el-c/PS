// The Fastest Sorting Algorithm In The World
#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    int n=0; string temp;
    while (getline(cin, temp) && ++n){
        if (temp == "0") break;
        cout << "Case " << n << ": Sorting... done!\n";
    }
}