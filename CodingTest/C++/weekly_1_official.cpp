using namespace std;
typedef long long ll;

long long solution(int price, int money, int count)
{
    ll answer = (ll)(count * (count+1) / 2) * price; 
    return answer > money ? answer - money : 0;
}

