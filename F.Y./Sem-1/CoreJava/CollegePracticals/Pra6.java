// 6. Print sum of even number upto 25.
class Pra6 {
    int Sum = 0;

    Pra6() {
        for (int i = 2; i <= 25; i += 2) {
            Sum += i;
        }
    }

    void display() {
        System.out.println("Sum of even numbers upto 25: " + Sum);
    }

    public static void main(String[] args) {
        Pra6 temp = new Pra6();
        temp.display();
    }
}