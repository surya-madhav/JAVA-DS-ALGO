package HackerRank;

import java.util.Scanner;

public class RotationOfMatrinx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int[][] array = getInputArray(sc);
            System.out.println("Test Case #"+Integer.toString(t+1)+":");
            logicExecute(array);
        }
    }
    private static int[][] getInputArray(Scanner sc) {
        int N = sc.nextInt();
        int[][] array = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    public static void logicExecute(int[][] array ){
        int N = array.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j]=array[N-1-j][i];
            }
        }
        printMatrix(result);
    }
    public static void printMatrix(int[][] array){
        int N = array.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
