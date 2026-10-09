import java.util.*;
public class 1_1 {
    public static class Point {
            private double x; 
            private double y; 
            public Point(double x, double y) {
                this.x = x; 
                this.y = y; 
            }
            public double distance(Point other) {
                return Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2)); 
            }
            @Override 
            public String toString() { 
                return super.toString(); 
            }

    }

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        double x1,y1,x2,y2; 
        while (t-->0) {
            x1= sc.nextDouble(); 
            y1 = sc.nextDouble(); 
            Point a = new Point(x1,y1); 
            x2 = sc.nextDouble(); 
            y2 = sc.nextDouble(); 
            Point b = new Point(x2,y2); 
            System.out.printf("%.4f\n", a.distance(b)); 
        }
    }

}