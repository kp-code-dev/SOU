// 8. Print the sum of digits which is entered by user.
// example: 25=2+5=7 | 120 = 1+2+0 = 3
import java.util.*;

class Pra8 {
    int number;
    int sum;

    Pra8(int num) {
        number = num;
        sum = 0;
        
        int temp = num; 
        
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
    }

    void display() {
        System.out.println("The sum of digits for " + number + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        
        Pra8 obj = new Pra8(userInput); 
        obj.display();
    }
}