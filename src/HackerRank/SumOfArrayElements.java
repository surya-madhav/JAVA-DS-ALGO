package HackerRank;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        ZonedDateTime zt = ZonedDateTime.now();
        ZonedDateTime zto = ZonedDateTime.now().minusHours(1);
        ZonedDateTime ztoo = ZonedDateTime.now().minusHours(2);
        System.out.println("zto = " + zto);
        System.out.println("zt = " + zt);
        System.out.println("ztoo = " + ztoo);
        if(zto.isBefore(zt) && zto.isAfter(ztoo)){
            System.out.println("Hello there");
        }

    }
}

