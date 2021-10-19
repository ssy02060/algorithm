import java.util.*;
import java.io.*;

class Main{
    public static int[][] dp;
    final static int W = 0;
    final static int V = 1;
    static int[][] things;

    static int n,k;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        dp = new int[1001][1001];

        n = sc.nextInt();
        k = sc.nextInt();

        things = new int[n][2];
        for(int i = 0; i < n; i++){
            things[i][W] = sc.nextInt();
            things[i][V] = sc.nextInt();
        }
        // i 는 무게
        // k 는 n 번째 물건 
        for(int i = 0 ; i < k; i++ ){
            
            for(int j = 0; j <= n; j++){
                
            }
        }
    }
}