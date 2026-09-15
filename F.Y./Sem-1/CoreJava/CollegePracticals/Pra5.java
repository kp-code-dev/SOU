// 5. Print Odd number upto User input.
import java.util.*;

class Pra5 {
    int Number;
    boolean isOdd;

    Pra5(int n) {
        Number = n;
        isOdd = (n % 2 == 1);
    }

    void display() {
        System.out.println("Number: " + Number);
        System.out.println("Is Odd: " + isOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Pra5 temp = new Pra5(number);
        temp.display();
    }
}