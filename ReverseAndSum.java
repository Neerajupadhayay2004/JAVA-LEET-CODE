import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            n = n / 10;
        }

        System.out.println("Original = " + original);
        System.out.println("Reverse = " + reverse);
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
