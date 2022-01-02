// 한조서열정리하고옴ㅋㅋ

#include <iostream>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, max;
	int arr[30001];

	cin >> N;


	for (int i = 0; i < N; i++)
		cin >> arr[i];

	max = 0;


	for (int i = 0; i < N; i++) {
		int height = arr[i];
		int cnt = 0;
		for (int j = i + 1; j < N; j++) {
			if (arr[j] < height)
				cnt++;
			else
				break;
		}
		if (max < cnt)
			max = cnt;
	}

	cout << max;

}