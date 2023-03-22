// 최솟값 찾기
// N개의 숫자 배열 -> L 길이의 구간 내 모든 최솟값

#include <deque>
#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, l, num;
    cin >> n >> l;

    deque<pair<int, int>> dq; // pair<수, 인덱스>
    for (int i = 0; i < n; i++) {
        cin >> num;
        if (!dq.empty() && dq.front().second <= i - l)
            dq.pop_front();

        while (!dq.empty() && dq.back().first >= num)
            dq.pop_back();

        dq.push_back(make_pair(num, i));

        cout << dq.front().first << " ";
    }
}

// 시간초과

// 덱 사용해서 최솟값 구하는 알고리즘

// 구간 범위 l 을 벗어난 숫자가 존재하면 pop
// 새로운 수보다 "크거나 같은" 수 모두 pop
// 새로 들어온 값은 뒷 구간에서 후보가 될 수 있으므로 push_back
// 맨 앞의 값이 항상 최솟값이므로, 출력