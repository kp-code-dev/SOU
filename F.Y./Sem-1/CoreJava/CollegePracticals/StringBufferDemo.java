public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer:" + sb);
        sb.append(" Java");
        System.out.println("After append:" + sb);
        sb.insert(5, " World");
        System.out.println("After insert:" + sb);
    }    
}
