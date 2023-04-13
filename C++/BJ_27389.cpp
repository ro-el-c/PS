// Metronome
#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(nullptr);
    double n; cin >> n;
    cout << fixed << setprecision(2) << n/4;
}