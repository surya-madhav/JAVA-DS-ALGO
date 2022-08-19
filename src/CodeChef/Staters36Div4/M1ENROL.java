package CodeChef.Staters36Div4;

import java.util.Scanner;

public class M1ENROL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y <= X) System.out.println(0);
            else System.out.println(Y-X);
        }
    }
}
