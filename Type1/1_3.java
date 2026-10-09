import java.util.*;

public class 1_3 {
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
    public double distance(Point other) {
      return Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2));
    }


  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double x; 
      double y; 
      int t = sc.nextInt(); 
      while (t-->0) {
        x = sc.nextDouble(); 
        y = sc.nextDouble(); 
        Point a = new Point(x,y); 
        Point b = new Point(0,0); 
        System.out.printf("%.2f\n", a.distance(b)); 
      }

  }


}