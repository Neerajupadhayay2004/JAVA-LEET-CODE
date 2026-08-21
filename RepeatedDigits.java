import java.util.Scanner;

public class RepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = Math.abs(n);
        int repeatedMask = 0;
        boolean found = false;

        if (original == 0) {
            System.out.println("No repeated digit");
            sc.close();
            return;
        }

        int temp = original;
        while (temp != 0) {
            int digit = temp % 10;
            int bit = 1 << digit;

            if ((repeatedMask & bit) != 0) {
                System.out.println("Repeated digit = " + digit);
                found = true;
                break;
            }

            repeatedMask |= bit;
            temp /= 10;
        }

        if (!found) {
            System.out.println("No repeated digit");
        }

        sc.close();
    }
}
