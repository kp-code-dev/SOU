// 13. print the sum of 1 to 100 and find that number is divisible by 7 or not.

class Pra13 {
    int sum = 0;
    boolean isDivisibleBy7;

    Pra13() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        if (sum % 7 == 0) {
            isDivisibleBy7 = true;
        } else {
            isDivisibleBy7 = false;
        }
    }

    void display() {
        System.out.println("Sum of numbers from 1 to 100: " + sum);
        System.out.println("Is the sum divisible by 7? " + isDivisibleBy7);
    }

    public static void main(String[] args) {
        Pra13 obj = new Pra13();
        obj.display();
    }
}