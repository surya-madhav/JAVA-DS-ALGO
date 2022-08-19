package HackerRank;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println((1<<n)-1);
            towerOfHanoi(n,'A','C','B');
        }
    }
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) return;
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move "+ n + " from " +
                from_rod +" to " + to_rod );
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
