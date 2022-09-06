// ����
// ���� ���� ���� ����, �Է� ��� ó�� ���α׷�
// push X : ���� X�� ���ÿ� �ִ� ����
// pop : ������ ���� ���� �ִ� ������ ����, �� ���� ���. ���ÿ� ����ִ� ������
// ���� ��� -1 ��� size : ���ÿ� ����ִ� ������ ���� ��� empty : ������
// ��������� 1, �ƴϸ� 0 top : ������ ���� ���� �ִ� ���� ���. ���ÿ� ����ִ�
// ������ ���� ��� -1 ���

#include <iostream>
#include <string>
using namespace std;

/*
Stack Ŭ���� ����

*/

int arr[10001]; // ����� �� n�� ���� : [1, 10000]
int s = -1;     // ���� top �ε���

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