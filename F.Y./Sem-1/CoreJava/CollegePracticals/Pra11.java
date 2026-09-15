// 11. Print the fibonacci series upto 25.

class Pra11 {

    Pra11(int num) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series upto " + num + ": ");
        while (a <= num) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    void display() {
        
    }

    public static void main(String[] args) {
        Pra11 obj = new Pra11(25); 
        obj.display();
    }
}