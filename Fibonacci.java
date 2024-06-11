public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Given number
        System.out.println("Fibonacci Series for first " + n + " numbers:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}



