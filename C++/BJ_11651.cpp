// 좌표 정렬하기 2
// y좌표 오름차순
// y좌표가 같으면 x좌표 오름차순

#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

bool compare(pair<int, int> l1, pair<int, int> l2) {
	if (l1.second == l2.second)
		return l1.first < l2.first;
	else
		return l1.second < l2.second;
}

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, x, y;
	cin >> N;
	vector<pair<int, int>> loc;

	for (int i = 0; i < N; i++) {
		cin >> x >> y;
		loc.push_back(make_pair(x, y));
	}

	sort(loc.begin(), loc.end(), compare);

	for (int i = 0; i < N; i++)
		cout << loc[i].first  << " " << loc[i].second << "\n";
	


}