import java.util.*;
public class 2_1 {

    public static class Rectangle {
        private double width;
        private double height;
        private String color;
        public Rectangle() {
            width = 1;
            height = 1;

        }
        public Rectangle (double width, double height, String color) {
            if (width <= 0 || height <= 0) throw new IllegalArgumentException();
            this.width = width;
            this.height = height;
//            this.color = color;
            this.color = Character.toUpperCase(color.charAt(0)) + color.substring(1).toLowerCase();

        }
        public double getWidth() {
            return this.width;
        }
        public double getHeight() {
            return this.height;
        }
        public String getColor() {
            return this.color;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double findArea() {
            return this.width*this.height;
        }
        public double findPerimeter() {
            return (this.width+this.height)*2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{ 
            Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt(), sc.next());
            System.out.printf("%.0f %.0f %s\n", r.findPerimeter(), r.findArea(), r.getColor());
        }
        catch(Exception e) { 
            System.out.println("INVALID");
        }
    }

}