// 수 정렬하기 2
// N개의 수 오름차순 정렬

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int N, x;
	cin >> N;
	int* arr = new int[N];

	for (int i = 0; i < N; i++)
		cin >> arr[i];

	// O(nlogn)
	sort(arr, arr + N);

	for (int i = 0; i < N; i++)
		cout << arr[i] << "\n";

}