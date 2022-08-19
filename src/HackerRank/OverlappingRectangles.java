package HackerRank;

import java.util.Scanner;

public class OverlappingRectangles {
    static class Point{
        int x,y;
        public Point(int x ,int y){
            this.x = x;
            this.y = y;
        }
    }
    static class Rectangle{
        Point l;
        Point r;
        int x_distance;
        int y_distance;
        int area;
        public Rectangle(Point l ,Point r){
            this.l = l;
            this.r = r;
            this.x_distance = Math.abs(l.x - r.x);
            this.y_distance = Math.abs(l.y-r.y);
            this.area = this.x_distance * this.y_distance;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Point l1 = new Point(0,0);
        Point r1 = new Point(0,0);
        Point l2 = new Point(0,0);
        Point r2 = new Point(0,0);
        for(int i =0;i<T;i++){
            l1.x = sc.nextInt();
            l1.y = sc.nextInt();
            r1.x = sc.nextInt();
            r1.y = sc.nextInt();
            l2.x = sc.nextInt();
            l2.y = sc.nextInt();
            r2.x = sc.nextInt();
            r2.y = sc.nextInt();
            Rectangle rect1 = new Rectangle(l1,r1);
            Rectangle rect2 = new Rectangle(l2,r2);
            System.out.println(rect1.area+rect2.area + overlapArea(rect1,rect2));
        }
    }
    public static int overlapArea(Rectangle rect1 ,Rectangle rect2){
        int res = 0;
        int x_distance = -Math.min(rect1.l.x ,rect2.l.x) + Math.max(rect1.r.x ,rect2.r.x);
        int y_distance = -Math.min(rect1.l.y ,rect2.l.y) + Math.max(rect1.r.y ,rect2.r.y);
        if(x_distance >0 && y_distance>0){
            res = x_distance *y_distance;
        }
        return res;
    }
}
