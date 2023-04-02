// 공 넣기
#include <iostream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m;
    cin >> n >> m;

    int  arr[101] = { 0 };
    int start, end, ball;
    for (int i=0; i<m; i++){
        cin >> start >> end >> ball;
        for (int j=start; j<=end; j++) arr[j] = ball;
    }

    for (int i=1; i<=n; i++) cout << arr[i] << " ";
}