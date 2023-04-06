// Who is in the middle?
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(nullptr);

    vector<int> vt;
    int n, t=3;
    while(t--){
        cin >> n;
        vt.push_back(n);
    }
    sort(vt.begin(), vt.end());
    cout << vt[1];
}