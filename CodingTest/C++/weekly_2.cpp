#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

string solution(vector<vector<int>> scores) {
    string answer = "";
    vector<int> sumOfScore;
    for(int i = 0; i < scores.size(); i++){
        for(int j = 0; j < scores[0].size(); j++){
            sumOfScore[i] = (scores[i][j]);
            cout << sumOfScore[i] << endl;
        }
    }
    return answer;
}