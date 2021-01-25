#include <bits/stdc++.h>

using namespace std;

// dfs : 맨 밑까지 내려갔다옴.
// 재귀 함수로 dfs
// 재귀 함수로 가능한 이유 : 재귀 함수의 호출이 스택으로 호출되기 때문.
void dfs(int start, vector<int> graph[], bool check[]){
	check[start]= true;
	printf("%d ", start);

	for(int i=0; i < graph[start].size(); i++){
		int next = graph[start][i];
		// 방문하지 않았다면
		if(check[next]==false){
			// 재귀함수를 호출한다.
			dfs(next, graph, check);
		}
	}
}
// 스택으로 dfs
void dfs(int start, vector<int> graph[], bool check[]){
	stack<int> s;
	s.push(start);
	check[start] = true;
	printf("%d ",start);

	while(!s.empty()){

		int current_node = s.top();
		s.pop();
		for(int i=0; i<graph[current_node].size(); i++){

			int next_node = graph[current_node][i];

			if(check[next_node]==false){
				printf("%d ", next_node);
				check[next_node] = true;
				// pop()을 했었기 때문에 현재 current_node도 넣어줘야한다.
				s.push(current_node);
				s.push(next_node);
				break;
			}
		}
	}
}
void bfs()