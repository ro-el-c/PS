// 단어 뒤집기
#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    cin.ignore(); // 버퍼 비우기
    // int형(=숫자)은 '\n'을 담지 못하기 때문에, 입력으로 숫자\n가 들어오면 숫자만 받아들이고 \n을 버린다.
    // 즉 \n이 입력 버퍼에 남아있다.
    // 이 상태에서 getline 메서드를 사용하게 되면, \n 때문에 한 줄을 읽은 것으로 연산이 된다.
    // getline 메서드의 default 구분자가 개행문자이기 때문
    // 따라서, 한 줄이 무시되는 것을 방지하기 위하여 cin.ignore()를 통해 입력 버퍼를 비워줘야 한다.

    stack<char> st;
    string in;
    while(n--){
        getline(cin, in);
        in += " ";
        for (int i=0; i<in.length(); i++) {
            if (in[i] == ' '){
                while(!st.empty()){
                    cout << st.top();
                    st.pop();
                }
                cout << " ";
            } else st.push(in[i]);
        }
        cout << "\n";
    }
}