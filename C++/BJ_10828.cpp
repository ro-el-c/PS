// 스택
// 정수 저장 스택 구현, 입력 명령 처리 프로그램
// push X : 정수 X를 스택에 넣는 연산
// pop : 스택의 가장 위에 있는 정수를 빼고, 그 수를 출력. 스택에 들어있는 정수가
// 없는 경우 -1 출력 size : 스택에 들어있는 정수의 개수 출력 empty : 스택이
// 비어있으면 1, 아니면 0 top : 스택의 가장 위에 있는 정수 출력. 스택에 들어있는
// 정수가 없는 경우 -1 출력

#include <iostream>
#include <string>
using namespace std;

/*
Stack 클래스 구현

*/

int arr[10001]; // 명령의 수 n의 범위 : [1, 10000]
int s = -1;     // 스택 top 인덱스

void push(int X) { arr[++s] = X; }

int empty(void) {
    if (s == -1)
        return 1;
    else
        return 0;
}

void pop(void) {
    if (empty() == 1)
        cout << -1 << endl;
    else {
        cout << arr[s] << endl;
        arr[s--] = 0;
    }
}

int size(void) { return s + 1; }

int top(void) {
    if (empty())
        return -1;
    else
        return arr[s];
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    string str;
    int N, n;

    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> str;

        if (str == "push") {
            cin >> n;
            push(n);
        } else if (str == "pop")
            pop();
        else if (str == "size")
            cout << size() << endl;
        else if (str == "empty")
            cout << empty() << endl;
        else
            cout << top() << endl;
    }
}