package HackerRank;

import java.io.*;
import java.util.Scanner;

public class PrintHollowDiamondPatternMyFailedTimeOutSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            diamondPattern(n ,i ,bw);
        }
        bw.flush();
    }

    public static void diamondPattern(int n ,int i ,BufferedWriter bw) throws IOException {
        int m = findMid(n);
        int[][] T = diagonalMatrix(m);
        int[][] TR = flipDiagonalMatrix(T);
        int[][] res = new int[n][n];
        bw.write("Case #"+Integer.toString(i+1)+":"+"\n");
        finalMatrix(n, m, T, TR, res ,bw);
    }

    private static void finalMatrix(int n, int m, int[][] T, int[][] TR, int[][] res ,BufferedWriter bw) throws IOException {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j< m){
                    res[i][j] = TR[i][j];
                    bw.write(res[i][j]==1?"*":" ");

                }else{
                    res[i][j] = T[i][j- m +1];
                    bw.write(res[i][j]==1?"*":" ");
                }
            }
            bw.write("\n");
        }
        for (int i = 0; i < m -1; i++) {
            res[m +i] = res[m -i-2];
            for (int j = 0; j < n; j++) {
                bw.write(res[m+i][j]==1?"*":" ");
            }
            bw.write("\n");
        }
    }

    public static int findMid( int n){
      return (n+1)/2;
    }
    public static int[][] diagonalMatrix( int m){
        int[][] T = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(j==i) T[i][j]=1;
            }
        }
        return T;
    }
    public static int[][] flipDiagonalMatrix(int[][] T){
        int m = T.length;
        int[][] TR = new int[m][m];
        for(int i=0;i<m;i++){
            for (int j = 0; j < m; j++) {
                TR[i][j] = T[i][m-j-1];
            }
        }
        return TR;
    }


    public static void fasterInput( ) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n, k;
            String[] inp=br.readLine().split(" ");
            n=Integer.parseInt(inp[0]);
            k=Integer.parseInt(inp[1]);
            inp=br.readLine().split(" ");
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
                ar[j]=Integer.parseInt(inp[j]);

            //logic goes here

            bw.write("Answer logic goes here"+"\n");
        }
        bw.flush(); //after all test cases
    }

}
