class OddEvenLoop {
    public static void main(String ar[]) {
        int a;
        for(a=1; a<=10; a++) {
            if(a%2==0)
                System.out.println("The number is even: " + a);
            else
                System.out.println("The number is odd: " + a);
        }
    }
}