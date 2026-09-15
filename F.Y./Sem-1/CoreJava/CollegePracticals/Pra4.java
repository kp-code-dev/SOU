// 4. Print Even number upto User input.
import java.util.*;

class Pra4 {
    int Number;
    boolean isEven;

    Pra4(int n) {
        Number = n;
        isEven = (n % 2 == 0);
    }

    void display() {
        System.out.println("Number: " + Number);
        System.out.println("Is Even: " + isEven);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Pra4 temp = new Pra4(number);
        temp.display();
    }
}