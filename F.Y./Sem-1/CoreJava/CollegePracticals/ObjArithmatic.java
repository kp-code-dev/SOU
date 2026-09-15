import java.util.*;

class ObjArithmatic {
    Scanner sc = new Scanner(System.in);
    // static int a, b;
    int a, b;

    void getData() {
    System.out.println("Enter one number: ");
    a = sc.nextInt();
    System.out.println("Enter two number: ");
    b = sc.nextInt();
    }

    void addition(int x, int y) {
        // int a, b;
        a = x;
        b = y;
        System.out.println("Addition of a and b is: " + (a + b));
    }
    void subtraction(int x, int y) {
        // int a, b;
        a = x;
        b = y;
        System.out.println("Subtraction of a and b is: " + (a - b));
    }
    void multiplication(int x, int y) {
        // int a, b;
        a = x;
        b = y;
        System.out.println("Multiplication of a and b is: " + (a * b));
    }
    void division(int x, int y) {
        // int a, b;
        a = x;
        b = y;
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        System.out.println("Division of a and b is: " + (a / b));
    }

    public static void main(String args[]) {
        ObjArithmatic obj = new ObjArithmatic();
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        obj.getData();
        obj.addition(obj.a, obj.b);
        obj.subtraction(obj.a, obj.b);
        obj.multiplication(obj.a, obj.b);
        obj.division(obj.a, obj.b);
    }
}