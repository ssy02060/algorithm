import java.util.*;
import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h,w;
        h = sc.nextInt();
        w = sc.nextInt();

        

        int[] input = new int[w];
        for(int i = 0; i < w; i++){
            input[i] = sc.nextInt();
        }
        solution(input, h, w);
    }
    public static void solution(int[] input, int h, int w){
        int result = 0;
        for(int i = 1 ; i < input.length - 1; i++){
            int left = 0;
            int right = 0;

            for(int j = 0; j < i; j++){
                left = Math.max(left, input[j]);
            }
            for(int j = i + 1; j < input.length; j++){
                right = Math.max(right, input[j]);
            }
            if(0 <  Math.min(left, right) - input[i])
                result +=  Math.min(left, right) - input[i] ; 

            
        }
        System.out.println(result);
    }
}