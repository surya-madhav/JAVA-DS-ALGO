package HackerRank;

import java.util.Scanner;

public class DiagonalTraverseOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int[][] array = getInputArray(sc);
            logicExecute(array);
        }
    }

    private static void logicExecute(int[][] array) {
        int[] result = new int[2* array.length -1];
        int N = array.length;
        for(int row=0;row<N;row++){
            for(int x=0;x<=row;x++){
                int y=(N-1)-row+x;
                result[row] += array[x][y];
                if(x!=y) result[result.length - 1 - row] += array[y][x];
            }
        }
        for(int r: result){
            System.out.print(r+" ");
        }
        System.out.println();
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
}

