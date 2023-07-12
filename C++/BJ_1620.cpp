#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>
using namespace std;

unordered_map<string, int> s2i;
string i2s[100001];

int main() {
    cin.tie(nullptr) -> sync_with_stdio(false);

    int n, m; cin >> n >> m;
    for (int i=1; i<=n; i++) {
        cin >> i2s[i];
        s2i[i2s[i]] = i;
    }

    while(m--) {
        string query; cin >> query;
        if(isdigit(query[0])) cout << i2s[stoi(query)] << "\n";
        else cout << s2i[query] << "\n";
    }
}