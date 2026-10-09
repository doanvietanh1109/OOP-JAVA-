import java.util.*; 
public class DANG15 {
    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public Point midpoint(Point other) {
            double m1 = (this.x + other.getX())/2;
            double m2 = (this.y + other.getY())/2; 
            return new Point(m1,m2); 
        }

        @Override
        public String toString() {
            return String.format("(%.2f,.%.2f)", this.x, this.y); 
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double x1,x2,y1,y2;
        while (t-->0) {
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            Point a = new Point(x1,y1);
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point b = new Point(x2,y2);
            Point m = a.midpoint(b); 
            System.out.println(m);

        }
    }
}