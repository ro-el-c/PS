#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    string input;
    cin >> input;

    stack<char> st;
    int answer = 0;

    for (int i = 0; i < input.length(); i++) {
        if (input[i] == '(')
            st.push(input[i]);
        else {
            st.pop();
            if (input[i - 1] == '(')
                answer += st.size();
            else
                answer++;
        }
    }

    cout << answer;
}