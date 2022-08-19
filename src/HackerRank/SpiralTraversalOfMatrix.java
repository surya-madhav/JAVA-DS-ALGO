package HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralTraversalOfMatrix {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Integer[][] arr = new Integer[N][N];
            for (int j = 0; j < N; j++) {
                List<Integer> inp = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                for (int k = 0; k < N; k++) {
                    arr[j][k] = inp.get(k);
                }
            }
            solve(arr,bw);
//            bw.flush();
        }
        bw.flush();
    }
    public static void solve ( Integer[][] arr ,BufferedWriter bw) throws IOException {
        int x=0,y=0 ,N= arr.length ,lines = (2*N)-1;
        for (int i = 0; i < lines; i++) {
            int direction = i%4;
            switch (direction){
                case 1:
                    do{
                        if(arr[x][y]==null){
                            x++;
                            continue;
                        }
                        bw.write(arr[x][y].toString()+" ");
                        arr[x][y]=null;
                        x++;
                    }while (x!=N && arr[x][y]!=null);
                    x--;
                    break;
                case 0:
                    do{
                        if(arr[x][y]==null){
                            y++;
                            continue;
                        }
                        bw.write(arr[x][y].toString()+" ");
                        arr[x][y]=null;
                        y++;
                    }while (y!=N && arr[x][y]!=null);
                    y--;
                    break;
                case 3:
                    do{
                        if(arr[x][y]==null){
                            x--;
                            continue;
                        }
                        bw.write(arr[x][y].toString()+" ");
                        arr[x][y]=null;
                        x--;
                    }while (x!=-1 && arr[x][y]!=null);
                    x++;
                    break;
                case 2:
                    do{
                        if(arr[x][y]==null){
                            y--;
                            continue;
                        }
                        bw.write(arr[x][y].toString()+" ");
                        arr[x][y]=null;
                        y--;
                    }while (y!=-1 && arr[x][y]!=null);
                    y++;
                    break;
                default:
                    return;
            }
        }
        bw.write("\n");
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

    public static void printa2DArray ( Integer[][] arr ,BufferedWriter bw) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }
    }
}
