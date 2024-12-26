public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println("Hello, world!");
            x++; //The bug was here, x was not being incremented
        }
    }
}