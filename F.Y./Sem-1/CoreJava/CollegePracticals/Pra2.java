// 2. Calculate Area of Rectangle.
import java.util.*;

class Pra2 {
    int Length;
    int Breadth;
    double Area;

    Pra2(int l, int b) {
        Length = l;
        Breadth = b;
        Area = l * b;
    }

    void display() {
        System.out.println("Length of Rectangle: " + Length);
        System.out.println("Breadth of Rectangle: " + Breadth);
        System.out.println("Area of Rectangle: " + Area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth of Rectangle: ");
        int breadth = sc.nextInt();
        Pra2 rectangle = new Pra2(length, breadth);
        rectangle.display();
    }
}
