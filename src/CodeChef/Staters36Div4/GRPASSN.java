package CodeChef.Staters36Div4;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class GRPASSN
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            List<Integer> p = new ArrayList<Integer>();
            for(int k=0;k<n;k++){
                p.add(sc.nextInt());
            }
            solution(p,n);
        }
        sc.close();
    }

    private static void solution(List<Integer> p, int n) {
        HashMap<Integer ,Integer> map = new HashMap<Integer ,Integer>();
        for(int x : p){
            if(map.containsKey(x)){
                map.put(x ,map.get(x)+1);
            }else{
                map.put(x ,1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key) % key != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;
    }
}
