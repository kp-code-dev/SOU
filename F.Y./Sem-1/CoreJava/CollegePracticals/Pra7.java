// 7. Print sum of odd numbers upto 220.
class Pra7 {
    int Sum = 0;

    Pra7() {
        for (int i = 1; i <= 220; i += 2) {
            Sum += i;
        }
    }

    void display() {
        System.out.println("Sum of odd numbers upto 220: " + Sum);
    }

    public static void main(String[] args) {
        Pra7 temp = new Pra7();
        temp.display();
    }
}