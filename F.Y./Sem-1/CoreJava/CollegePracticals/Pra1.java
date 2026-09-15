// 1. Calculate Area of Circle.
import java.util.*;

class Pra1 {
    int Radius;
    double Area;

    Pra1(int r) {
        Radius = r;
        Area = Math.PI * r * r;
    }

    void display() {
        System.out.println("Radius of Circle: " + Radius);
        System.out.println("Area of Circle: " + Area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        int radius = sc.nextInt();
        Pra1 circle = new Pra1(radius);
        circle.display();
    }
}
