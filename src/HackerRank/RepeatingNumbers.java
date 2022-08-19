package HackerRank;

import java.util.*;

public class RepeatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            List<Integer> array = new ArrayList<Integer>();
            HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
            for (int j = 0; j < N; j++) {
                array.add(sc.nextInt());
                if(hp.containsKey(array.get(j))){
                    hp.put(array.get(j),hp.get(array.get(j))+1);
                }else {
                    hp.put(array.get(j),1);
                }
            }
            for(Integer f: hp.keySet()){
                if(hp.get(f)==2){
                    System.out.print(f+" ");
                }
                System.out.println();
            }
        }
    }
}
