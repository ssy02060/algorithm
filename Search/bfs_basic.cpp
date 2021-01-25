#include <stdio.h>

int table[100][100] = {};
int cnt = 0;

void insert_to_table(int x, int y){
	table[x][y] = 1;
}

void reset_table(){
	cnt = 0;
	for(int i = 0; i < 100; i++){
		for(int j = 0; j < 100; j++){
			table[i][j] = 0;
		}
	}
}



void bfs(int x, int y, bool isFirst){
	
	if(table[x][y] == 1){
		table[x][y] = 0;
		if(isFirst == true)
			cnt++;
		
		bfs(x-1, y, false);
		bfs(x+1, y, false);
		bfs(x, y+1, false);
		bfs(x, y-1, false);
	}
	else	return;
}
void check_table(int m, int n){
	for(int i = 0; i < m; i++){
		for(int j = 0; j < n; j++){
			bfs(i, j, true);
		}
	}
}
int main()
{
	int tc;
	scanf("%d", &tc);
	
	for(int idx = 0; idx < tc; idx++){
		int M, N, K;
		int x, y;
		
		scanf("%d %d %d", &M, &N, &K);
		
		for(int i = 0; i < K; i++){
			scanf("%d %d", &x, &y);
			insert_to_table(x, y);
		}
		check_table(M, N);
		printf("%d\n", cnt);
		reset_table();
	}
	
	return 0;
}
