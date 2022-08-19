package HkContest;

import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            loic(N);
        }
    }
    public static void loic(long N){
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(N); i++)
        {
            if (N % i == 0) {
                if (N / i == i)
                    counter++;
                else
                    counter = counter + 2;
            }
        }
        System.out.println(counter);
    }
}
