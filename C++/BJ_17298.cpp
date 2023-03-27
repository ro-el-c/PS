// 오큰수

#include <iostream>
#include <vector>
#include <stack>
using namespace std;

int main(){
    int n;
    cin >> n;

    vector<int> vt(n);
    // 배열의 오른쪽부터 접근하기 위하여 반대로 입력 받음
    for(int i=n-1; i>=0; i--) cin >> vt[i];
    
    stack<int> ans, cand; // cand: 후보가 될 수 있는 숫자

    cand.push(vt[0]);
    for(int i=0; i<n; i++){
        while(!cand.empty() && cand.top() <= vt[i]) cand.pop();
        
        if(cand.empty()) ans.push(-1);
        else ans.push(cand.top());
        
        cand.push(vt[i]);
    }

    while(!ans.empty()){
        cout << ans.top() << " ";
        ans.pop();
    }
}