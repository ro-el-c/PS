// 특별한 학교 이름
#include <iostream>
#include <string>
#include <map>
using namespace std;

int main(){
    map<string, string> school;

    school["NLCS"] = "North London Collegiate School";
    school["BHA"] = "Branksome Hall Asia";
    school["KIS"] = "Korea International School";
    school["SJA"] = "St. Johnsbury Academy";
    
    string inputString;
    cin >> inputString;
    cout << school.at(inputString);
}