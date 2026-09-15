import java.util.*;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        // int num = 5; 
        // int num = Integer.parseInt(args[0]);
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

// class While {
//     public static void main(String[] args) {
//     int count = 1;
//     while (count <= 10) {
//         System.out.println(count);
//         count++;
//     }
//     }
// }