// 올바른 배열

#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, min = 0;
	int arr[50];

	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> arr[i];
	}

	sort(arr, arr + N);

	for (int i = 0; i < N; i++) {
		int cnt = 1;
		int add = 1;

		for (int j = i + 1; j < N; j++) {
			add += arr[j] - arr[j - 1];
			if (add >= 5)
				break;
			cnt++;
		}

		if (add == 5)
			cnt++;

		if (min < cnt)
			min = cnt;
	}

	cout << 5 - min;
}