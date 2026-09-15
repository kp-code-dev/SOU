// 9. Find given number is prime or not.
// note:which number is divisible by it self this prime.
import java.util.*;

class Pra9 {
    int number;
    boolean isPrime;

    Pra9(int num) {
        number = num;
        isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
    }

    void display() {
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        
        Pra9 obj = new Pra9(userInput); 
        obj.display();
    }
}