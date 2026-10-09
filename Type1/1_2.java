import java.util.*; 


public class 1_2{
    public static class Location {
        private double xNha; 
        private double yNha; 
        public Location(double xNha, double yNha) {
            this.xNha = xNha; 
            this.yNha = yNha; 
        }
        public double getX() {
            return this.xNha; 
        }
        public double getY() {
            return this.yNha; 
        }
        public double distance(Location other) {
            return Math.sqrt(Math.pow(this.xNha-other.xNha,2) + Math.pow(this.yNha-other.yNha,2)); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double xNha; 
        double yNha;
        double xTruong; 
        double yTruong; 
        int t = sc.nextInt(); 
        while (t-->0) {
            xNha = sc.nextInt(); 
            yNha = sc.nextInt();
            Location a = new Location(xNha,yNha); 
            xTruong = sc.nextInt(); 
            yTruong = sc.nextInt(); 
            Location b = new Location(xTruong,yTruong); 
            System.out.printf("%.2f\n", a.distance(b));
            
        }
    }
}