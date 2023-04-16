// 입실 관리
#include <iostream>
#include <string>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    string temp;
    cin >> n;

    while (n--) {
        cin >> temp;
        for (int i = 0; i < temp.length(); i++) {
            temp[i] = tolower(temp[i]);
        }
        cout << temp << "\n";
    }
}