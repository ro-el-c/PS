// 해시
#include <iostream>
#include <string>
#include <unordered_set>
#include <vector>
using namespace std;

unordered_set<string> s;

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    
    int n; cin >> n;
    while(n--) {
        string name, log; cin >> name >> log;
        if (log == "enter") s.insert(name);
        else s.erase(name);
    }

    vector<string> ans(s.begin(), s.end());
    sort(ans.begin(), ans.end(), greater<string>());
    for(auto x : ans) cout << x << "\n";
}