// 스택 수열
// 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓는다
// push 순서는 반드시 1~n 오름차순
// 임의의 수열을 스택을 이용해 만들 수 있다면 push ("+") 와 pop ("-") 연산의
// 순서를 출력 만들 수 없다면 "NO" 출력

#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    stack<int> st;
    int n, cnt = 1, num; // cnt은 자연수 몇까지 추가 되었는지 표시
    string result = "";

    cin >> n;

    for (int i = 0; i < n; i++) { // while(num--)
        cin >> num;

        // 스택 cnt가 num보다 작으면 그 수까지 추가
        while (cnt <= num) {
            st.push(cnt++);
            result += "+\n";
        }

        // 그 수 pop
        if (st.top() == num) {
            result += "-\n";
            st.pop();
        } else {
            cout << "NO";
            return 0;
        }
    }

    cout << result;
}