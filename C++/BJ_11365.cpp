// !밀비 급일
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {
    string temp;
    while (getline(cin, temp)){
        if (temp == "END") break;
        reverse(temp.begin(), temp.end());
        cout << temp << "\n";
    }
}