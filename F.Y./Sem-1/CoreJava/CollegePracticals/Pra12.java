// 12. find the greatest number, 
// (i) a a>b
// (ii) b a>b>c (using else if)
// (iii) c a>b>c>d (using nested if)

class Pra12 {
    int a, b, c, d;
    int maxOfTwo, maxOfThree, maxOfFour;

    Pra12(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        // (i) Greatest between a and b (Simple if-else)
        if (a > b) {
            maxOfTwo = a;
        } else {
            maxOfTwo = b;
        }

        // (ii) Greatest among a, b, c (using else if)
        if (a >= b && a >= c) {
            maxOfThree = a;
        } else if (b >= a && b >= c) {
            maxOfThree = b;
        } else {
            maxOfThree = c;
        }

        // (iii) Greatest among a, b, c, d (using nested if)
        if (a >= b) {
            if (a >= c) {
                if (a >= d) {
                    maxOfFour = a;
                } else {
                    maxOfFour = d;
                }
            } else {
                if (c >= d) {
                    maxOfFour = c;
                } else {
                    maxOfFour = d;
                }
            }
        } else {
            if (b >= c) {
                if (b >= d) {
                    maxOfFour = b;
                } else {
                    maxOfFour = d;
                }
            } else {
                if (c >= d) {
                    maxOfFour = c;
                } else {
                    maxOfFour = d;
                }
            }
        }
    }

    void display() {
        System.out.println("Numbers given: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
        System.out.println("--------------------------------------------------");
        System.out.println("(i) Greatest among a and b: " + maxOfTwo);
        System.out.println("(ii) Greatest among a, b, and c: " + maxOfThree);
        System.out.println("(iii) Greatest among a, b, c, and d: " + maxOfFour);
    }

    public static void main(String[] args) {
        Pra12 obj = new Pra12(10, 20, 30, 40);
        obj.display();
    }
}