class Constructor {
    Constructor() {
        System.out.println("Constructor called");
    }
    
    int num = 5; 
    int factorial = 1;

    public void display() {
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void main(String args[]) {
        Constructor obj = new Constructor();
        obj.display(); 
    }
}
