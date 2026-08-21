import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int digits = String.valueOf(Math.abs(n)).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
