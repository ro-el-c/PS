// 회사에 있는 사람

#include <iostream>
#include <string>
#include <set>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	string name, state;
	int n;
	cin >> n;

	set<string> who;

	for (int i = 0; i < n; i++) {
		cin >> name >> state;
		if (state == "enter")
			who.insert(name);
		else
			who.erase(name);
	}

	for (auto it = who.rbegin(); it != who.rend(); it++)
		cout << *it << '\n';

	return 0;
}