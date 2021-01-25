#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int stack[200000];

int top = -1;
int isEmpty(){
	return top == -1;
}

void push(char data){
	stack[++top] = data;
}
int pop(){
	return stack[top--];
}

int peek(){
	return stack[top];
}
void clear(){
    for(int i = 0; i < top; i++){
        stack[i] = 0;
    }
}

int get_result(char* str){
    int len;
    len = strlen(str);
    for(int i = 0; i < len; i++){
        if(str[i] == '(' ){
            push(str[i]);
        }
        else if(str[i] == ')'){
            if(!isEmpty()){
                pop();
            }
            else 
                return -1;
                
        }
    }
    if(top >= 0){
        return -1;
    }
    return 1;
}
int main(){
	int K;
	
	scanf("%d", &K);
    char str[100];
	
	for(int tc = 0; tc < K; tc++){
		
        
		scanf("%s", str);
        
        if(get_result(str) == 1){
            printf("YES\n");
        }
        else{
            printf("NO\n");
        }
        top = -1;

	}
	
	
	return 0;
}