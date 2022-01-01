// 영화감독 숌
// 종말의 숫자 : 6이 적어도 3개 이상 연속으로 들어가는 수

#include <iostream>
#include <string>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int cnt = 0, N, n = 666;
	string str;

	cin >> N;

	while (1) {
		str = to_string(n);
		if (str.find("666") != string::npos) {
			cnt++;
			if (cnt == N) {
				cout << n << endl;
				break;
			}
		}
		n++;
	}


}