package HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DistinctElementsInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] inp=br.readLine().split(" ");
            int N = Integer.parseInt(inp[0]);
            int k = Integer.parseInt(inp[1]);
            List<Integer> arr = new ArrayList<Integer>();
            inp=br.readLine().split(" ");
            for (int j = 0; j <N; j++) {
                arr.add(Integer.parseInt(inp[j]));
            }
            solve(arr, k ,N ,bw);
            bw.write("\n");
        }
        bw.flush();
    }
    public static void solve(List<Integer> arr ,int K ,int N ,BufferedWriter bw) throws IOException {
        int start = 0,end =0;
        HashMap<Integer ,Integer> hp = new HashMap<Integer,Integer>();
        while (end!=N){
            end = start + K;
            updateHashmap(hp ,arr ,start ,end ,bw);
//            System.out.println(arr.subList(start,end));
            start++;
        }
    }
    public static void updateHashmap(HashMap<Integer ,Integer> hp, List<Integer> arr ,int start ,int end ,BufferedWriter bw) throws IOException {
        if(hp.size()==0){
            for (int i = 0; i < arr.subList(start ,end).size(); i++) {
                addToHashMap(hp,arr.get(i));
            }
        }else{
            Integer arrStart = arr.get(start-1);
            if(hp.get(arrStart)-1==0){
                hp.remove(arrStart);
            }else{
                hp.put(arrStart, hp.get(arrStart) -1);
            }

            Integer arrEnd = arr.get(end-1);
            addToHashMap(hp, arrEnd);
        }
        bw.write(hp.size()+" ");
    }

    private static void addToHashMap(HashMap<Integer, Integer> hp, Integer element) {
        if(hp.containsKey(element)){
            hp.put(element, hp.get(element)+1);
        }else{
            hp.put(element,1);
        }
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
