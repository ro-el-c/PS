// 괄호
// 스택 사용

#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    int T;
    cin >> T;

    while (T--) {
        string str;
        stack<char> st;
        string check = "YES";

        cin >> str;
        for (int i = 0; i < str.length(); i++) {
            if (str[i] == '(') {
                st.push(str[i]);
            } else {
                if (st.empty()) {
                    check = "NO";
                    break;
                }
                st.pop();
            }
        }

        if (!st.empty())
            check = "NO";

        cout << check << "\n";
    }
    return 0;
}