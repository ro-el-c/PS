#include <string>
#include <vector>
#include <algorithm>
#include <sstream>

using namespace std;

string solution(string s) {
    string answer = "";
    istringstream ss(s);
    string stringBuffer;
    
    vector<int> arr;
    while(getline(ss, stringBuffer, ' ')){
        arr.push_back(stoi(stringBuffer));
    }
    
    sort(arr.begin(), arr.end());
    answer += to_string(arr[0]) + " " + to_string(arr[arr.size()-1]);
    
    return answer;
}