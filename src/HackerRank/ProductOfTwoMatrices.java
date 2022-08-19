package HackerRank;

import java.util.Scanner;

public class ProductOfTwoMatrices {
    public static class Matrix{
        int m,n;
        int[][] matrix;

        public Matrix(int m, int n, int[][] mat) {
            this.m = m;
            this.n = n;
            this.matrix = mat;
        }
        void pritMatrix(){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(this.matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public Matrix multiplication(Matrix mat2) throws Exception {
            if(this.n != mat2.m){
                throw new Exception("Matrix Multiplication not possible");
            }
            int[][] res = new int[this.m][mat2.n];
            int sum;
            for (int i = 0; i < this.m; i++) {
                for (int j = 0; j < mat2.n; j++) {
                    sum = 0;
                    for (int k = 0; k < mat2.m; k++) {
                        sum+=this.matrix[i][k]* mat2.matrix[k][j];
                    }
                    res[i][j] = sum;
                }
            }

            return new Matrix(this.m , mat2.n ,res);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            Matrix mat1 = extracted(sc);
            Matrix mat2 = extracted(sc);
            mat1.multiplication(mat2).pritMatrix();;
        }
    }
    public static Matrix extracted(Scanner sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                mat[j][k]= sc.nextInt();
            }
        }
        return new Matrix(m,n,mat);
    }
}
