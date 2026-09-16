class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("Original String: " + str);

        // 1. length()
        System.out.println("Length: " + str.length());
        
        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. concat()
        System.out.println(" Concat: " + str.concat("Programming"));

        // 4. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 5. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. substring()
        System.out.println("Substring: " + str.substring(6));

        // 7. equals()
        String str2 = "Hello, Java!";
        System.out.println("Equals: " + str.equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("Eqauls Ignore Case: " + str.equalsIgnoreCase("HELLO JAVA"));

        // 9. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 10. startsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // 11. endsWith()
        System.out.println("Ends with 'Java!': " + str.endsWith("Java!"));

        // 12. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 13. replace()
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 14. trim()
        String str3 = "   Hello, Java!   ";
        System.out.println("After Trim: '" + str3.trim());

        // 15. isEmpty()
        System.out.println("Is Empty: " + str.isEmpty());

    }
}