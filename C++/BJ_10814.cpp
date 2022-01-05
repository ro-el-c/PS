// 나이순 정렬
// 입력된 N명의 회원들을
// 나이가 증가하는 순으로,
// 나이가 같으면. 먼저 가입한 사람(입력이 먼저 된 사람)이 앞에 오도록

#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <utility>

using namespace std;

bool compare(pair<int, string> p1, pair<int, string> p2) {
	return p2.first > p1.first;
}

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, age;
	string name;
	vector<pair<int, string>> user;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> age >> name;
		user.push_back(make_pair(age, name));
	}

	stable_sort(user.begin(), user.end(), compare);

	for (int i = 0; i < N; i++) {
		cout << user[i].first << " " << user[i].second << "\n";
	}

}