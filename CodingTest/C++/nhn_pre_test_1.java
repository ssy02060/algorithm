import java.io.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    private static int cnt; //영역의 크기 계산
    private static int[] X = {-1, 0, 1, 0}; // x 좌표, 좌 상 우 하
    private static int[] Y = {0, 1, 0, -1}; // y 좌표, 좌 상 우 하
    public static void main(String[] args){
        
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // printMatrix(matrix);
        solution(n, matrix);


    }

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        List<Integer> matrix_list = new ArrayList<>(); //영역의 갯수 계산을 위해

        for (int i = 0; i < sizeOfMatrix; i++)
        {
            for (int j = 0; j < sizeOfMatrix; j++)
            {
            	//영역의 원소가 1, 방문하지 않은곳
                if (matrix[i][j] == 1)
                {
                    dfs(i, j, matrix);
                    matrix_list.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(matrix_list); // 영역은 오름차순으로 출력
        System.out.println(matrix_list.size());
        for(int i : matrix_list)
        {
            System.out.print(i + " ");
        }

    }

    private static void dfs(int x, int y, int[][] matrix)
    {
        matrix[x][y] = 0;
        int nx;
        int ny;

        for (int i = 0; i < 4; i++)
        {
            nx = x + X[i];
            ny = y + Y[i];

            //이동할 수 있는 최대 최소 위치안에 있어야된다.
            if (nx >= 0 && ny >= 0 && nx < matrix.length && ny < matrix.length)
            {
                if (matrix[nx][ny] == 1)
                {
                    dfs(nx, ny, matrix);
                    printMatrix(matrix);
                }
            }
        }
        //영역의 크기 증가
        cnt++;
    }
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.println("");
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("");
    }
}
// dfs는 잘 구현했으나 영역 세는게 이상했음.
// 
class nhn_pre_test{
    static int count = 0;
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        countArea(matrix);
        // printMatrix(matrix);
        
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.println("");
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public static void countArea(int[][] matrix){
        List<Integer> area_list = new ArrayList<>(); //영역의 갯수 계산을 위해

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 1){
                    dfs(matrix, i, j);
                    area_list.add(count);
                    count = 0;
                }
            }
        }
        for(int i : area_list)
        {
            System.out.print(i + " ");
        }
    }
    
    public static void dfs(int[][] matrix, int i, int j){
        final int X = 0;
        final int Y = 1;

        int[][] diretion = {{1, 0}, {-1, 0} , {0, 1}, {0, -1}};
        if(matrix[i][j] == 0){
            return ;
        }
        matrix[i][j] = 0;
        for(int k = 0; k < 4; k++){
            int nx = i + diretion[k][X];
            int ny = j + diretion[k][Y];

            if(nx < 0 || ny < 0 || nx >= matrix.length || ny >= matrix.length){
                continue;
            }
            dfs(matrix, nx, ny);
        }
        count++;
    }
}