// 직사각형에서 탈출

#include <iostream>
using namespace std;

int main(void) {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int x, y, w, h;
	int min = 1000;

	cin >> x >> y >> w >> h;

	if (w - x < min)
		min = w - x;
	if (x < min)
		min = x;
	if (y < min)
		min = y;
	if (h - y < min)
		min = h - y;

	cout << min;

}