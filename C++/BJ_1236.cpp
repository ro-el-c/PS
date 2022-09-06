// 성 지키기

#include <iostream>
#include <string>
using namespace std;

int main(void) {
    int n, m;

    cin >> n >> m;

    char row[n];
    char col[m];

    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;
        
        for(int j=0; j<m; j++){
            if (str[j] == 'X'){
                row[i] = 'X';
                col[j] = 'X';
            }
        }
    }

    int cnt_row=0;
    for (int i=0; i<n; i++){
        if(row[i] != 'X'){
            cnt_row++;
        }
    }
    int cnt_col=0;
    for (int i=0; i<m; i++){
        if(col[i] != 'X'){
            cnt_col++;
        }
    }

    int ans = (cnt_row > cnt_col) ? cnt_row : cnt_col;

    cout << ans;
}