// 후위 표기식
#include <iostream>
#include <string>
#include <stack>
#include <vector>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    string inStr; cin >> inStr;

    stack<char> postfix;
    for (int i=0; i<inStr.length(); i++){
        char temp = inStr[i];

        if (temp == '(') {
            postfix.push(temp);
        } else if (temp == ')'){ 
            while(!postfix.empty() && postfix.top() != '(') {
                cout << postfix.top();
                postfix.pop();
            }
            postfix.pop();
        } else if (temp == '*' || temp == '/') {
            while(!postfix.empty() && (postfix.top() == '*' || postfix.top() == '/')){
                cout << postfix.top();
                postfix.pop();
            }
            postfix.push(temp);
        } else if (temp == '+' || temp == '-') {
            while(!postfix.empty() && postfix.top() != '('){
                cout << postfix.top();
                postfix.pop();
            }
            postfix.push(temp);
        } else {
            cout << temp;
        }
    }
    while(!postfix.empty()){
        cout << postfix.top();
        postfix.pop();
    }
}