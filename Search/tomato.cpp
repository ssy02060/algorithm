#include <bits/stdc++.h>

using namespace std;
int table[2000][2000] = {};
int d[2000][2000] = {};
int m,n;
int cnt = 0;
int dx[4] = {0,0,1,-1};
int dy[4] = {1,-1,0,0};

bool isInside(int nx, int ny){
    if(0 <= nx && nx < n && 0 <= ny && ny < m)
        return true;
    else return false;
}
int main(){
    queue<pair<int, int>> q;
    cin >> m >> n;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            d[i][j] = -1;
            cin >> table[i][j];
            if (table[i][j] == 1) { 
                q.push( {i, j} );
                d[i][j] = 0; 
            }
        }
    }

    while(!q.empty()){
        int x = q.front().first;
        int y = q.front().second;

        q.pop();
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            // x: 0 ~ n, y: 0 ~ m
            if(isInside(nx, ny)){
                // 방문한 적이 없거나, 안익은 토마토이면
                if(table[nx][ny] == 0 && d[nx][ny] == -1){
                    // 해당 좌표의 day table 값을 업데이트(+1)
                    // 이전 날 값 +1
                    d[nx][ny] = d[x][y] + 1;
                    q.push({nx,ny});
                }
            }
        }
    }
    
    int result = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            result = max( result , d[i][j]);
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(table[i][j] == 0 && d[i][j] == -1){
                result = -1;
            }
        }
    }

    cout << result;

    return 0;
}