package HackerRank;

import javax.print.attribute.standard.NumberOfDocuments;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MagicMatrixSolution {
    static List<List<Integer>> allMagicSquares = new ArrayList<List<Integer>>();

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        /*
        * 1. Convert s to flat array
        * 2. Generate all magic matrices in form of flat array
        * 3. For all Magic matrices, find the cost and print the minimum
        * */
        int n = s.size();
        List<Integer> sFlat = flattenMatrix(s);
        List<Boolean> taken  = new ArrayList<Boolean>(sFlat.size());
        for (int i = 0; i < sFlat.size(); i++) {
            taken.add(false);
        }
        findAllMagicSquares(new ArrayList<Integer>(),0,taken,sFlat.size() ,n);
        int min = cost(allMagicSquares.get(0),sFlat);
        for (int i = 0; i < allMagicSquares.size(); i++) {
            int c = cost(allMagicSquares.get(i),sFlat);
            if(c<min) min = c;
        }
        return min;
    }
    public static List<Integer> flattenMatrix(List<List<Integer>> s){
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(0).size(); j++) {
                result.add(s.get(i).get(j));
            }
        }
        return result;
    }
    public static int cost(List<Integer>mm ,List<Integer>ip){
        int res = 0;
        for (int i = 0; i < mm.size(); i++) {
            res+=Math.abs(ip.get(i)-mm.get(i));
        }
        return Math.abs(res);
    }
    public static void findAllMagicSquares(List<Integer> output ,int idx ,List<Boolean> taken ,int N, int m){
        ArrayList copy = new ArrayList(output);
        if(idx==N && metAllMagicSquareConditions(copy ,m)){
            ArrayList copy1 = new ArrayList(copy);
            allMagicSquares.add(copy1);
            return;
        }

        for(int i=0;i<N;i++){
            if(!taken.get(i)){
                taken.set(i,true);
                copy.add(i+1);
                findAllMagicSquares(copy,idx+1,taken,N ,m);
                taken.set(i,false);
                copy.remove(copy.size()-1);
            }
        }

    }
    private static boolean metAllMagicSquareConditions(List<Integer> output ,int m) {
        Boolean result = true;
        Integer sum = null;
        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                s+=output.get((m*i)+j);
            }
            if(sum==null){
                sum=s;
            }else{
                if(sum!=s) return false;
            }
        }
        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                s+=output.get(i + (m*j));
            }
            if(sum==null){
                sum=s;
            }else{
                if(sum!=s) return false;
            }
        }
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < m; i++) {
            d1 += output.get(i+(m*i));
            d2 += output.get(m*(i+1)-(i+1));
        }
        if(d1!=sum || d2!=sum){
            return false;
        }

        return true;
    }

}

public class MagicMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = MagicMatrixSolution.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
