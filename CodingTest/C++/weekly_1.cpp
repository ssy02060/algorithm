#include <iostream>
using namespace std;

long long solution(int price, int money, int count){
    int answer = -1;
    int sum = 0;

    for(int i = 1; i <= count; i++){
        sum += price * i;
    }
    
    answer = money - sum;
    if(answer < 0){
        return -answer;
    }
    else{
        return 0;
    }
    return answer;
}
int main(void){
    cout << solution(3, 20, 4) << endl;;
    return 0;
}

