import java.util.*;
public class 1_4 {
    public static class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double distance (Point other) {
            return (Math.sqrt(Math.pow(this.x-other.x,2)+ Math.pow(this.y-other.y,2)));
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA,yA,xB,yB,xC,yC;
        int t = sc.nextInt();
        while (t-->0) {
            xA = sc.nextInt();
            yA= sc.nextInt();
            Point a = new Point(xA,yA);
            xB = sc.nextInt();
            yB = sc.nextInt();
            Point b = new Point(xB,yB);
            xC = sc.nextInt();
            yC = sc.nextInt();
            Point c = new Point(xC,yC);
            double ab = a.distance(b); 
            double bc = b.distance(c); 
            double total = ab + bc; 
            System.out.printf("%.2f\n", total); 

        }
        sc.close(); 
    }
}