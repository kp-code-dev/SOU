// class Single {
class Father {
    // String brand;
    String name;

    // void honk() {
    void house() {
        // System.out.println("Beep");
        System.out.println("This is my house");
    }
}

// class car extends Single {
class Son extends Father {
    
    // int doors;
    int age;

    // void drive() {
    void bike() {
        // System.out.println("I'm in Driving mode");
        System.out.println("This is my bike");
    }

}

// class Main {
class Single {
    public static void main(String[] args) {
        // car c = new car();
        // c.honk();
        // c.drive();

        Son s = new Son();
        s.bike();
        s.house();
    }
}
