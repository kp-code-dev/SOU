import java.util.*;

class ArmStrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 

        int original = num;

        int sum = 0;
        // int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (digit * digit * digit);
            // reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == sum)
            System.out.println("This is our Armstrong number : " + original);
        else
            System.out.println("This is not our Armstrong number : " + original);
    // if (original == reverse)
    //         System.out.println("This is our Palindrome number : " + original);
    //     else
    //         System.out.println("This is not our Palindrome number : " + original);
    // }
}
}
