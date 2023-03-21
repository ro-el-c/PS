// PPAP
// P -> PPAP로 파생 가능
// 입력된 문열이 PPAP 문자열인지 판별

#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    string input;
    cin >> input;

    stack<char> st;

    input.append(" ");
    for (int i = 0; i < input.length(); i++) {
        if (input[i] == 'P')
            st.push(input[i]);
        if (input[i] == 'A') {
            if (st.size() < 2 || input[i + 1] != 'P') {
                cout << "NP";
                return 0;
            }
            st.pop();
            st.pop();
        }
    }

    // PPPAPAP
    // PPP -> P -> PP -> P

    // PPAPAPP
    // PP -> empty -> P -> size < 2

    // PPAPP
    // PP -> empty -> P -> PP

    if (st.size() != 1) {
        cout << "NP";
        return 0;
    }
    cout << "PPAP";
}