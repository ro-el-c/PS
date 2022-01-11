// 수 정렬하기 3

#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, temp;
	cin >> N;
	// 정렬 함수 -> 메모리 초과
	// 입력받는 수는 10,000보다 작거나 같은 자연수
	// 배열 인덱스를 입력받는 수라고 생각하고 개수 카운트

	int num[10001] = { 0 };

	for (int i = 0; i < N; i++) {
		cin >> temp;
		num[temp]++;
	}

	for (int i = 1; i < 10001; i++) {
		for (int j = 0; j < num[i]; j++)
			cout << i << "\n";
	}
}