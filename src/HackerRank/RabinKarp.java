package HackerRank;

import java.io.*;

public class RabinKarp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] st =  br.readLine().split(" ");
            char[] key = st[0].toCharArray();
            char[] string  = st[1].toCharArray();
            System.out.println(countKeyInString(key ,string));
        }
    }

    private static int countKeyInString(char[] a, char[] b) {
        int count =0;

        return count;
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
