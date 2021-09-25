import java.util.Scanner;
public class L6_T9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println(fib(num));
    }

    static int fib (int num) {
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else
            return fib(num - 1) + fib(num - 2);
    }
}
