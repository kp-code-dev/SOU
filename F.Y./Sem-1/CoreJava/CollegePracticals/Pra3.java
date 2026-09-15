// 3. Convert Celsius to Fahrenheit.
import java.util.*;

class Pra3 {
    double Celsius;
    double Fahrenheit;

    Pra3(double c) {
        Celsius = c;
        Fahrenheit = (c * 9/5) + 32;
    }

    void display() {
        System.out.println("Celsius: " + Celsius);
        System.out.println("Fahrenheit: " + Fahrenheit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        double celsius = sc.nextDouble();
        Pra3 temp = new Pra3(celsius);
        temp.display();
    }
}