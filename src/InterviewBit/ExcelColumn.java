package InterviewBit;

public class ExcelColumn {
    public static void main(String[] args) {
        String s = "AAA";
        long res = 0;
        char[] arr = s.toCharArray();
        int pow = 0;
        for (int i = arr.length-1; i >=0; i--) {
            int current = (int) arr[i] - 64;
            res = res +(int) (current*Math.pow(26,pow));
            pow++;
            System.out.println(res);
        }
    }
}
