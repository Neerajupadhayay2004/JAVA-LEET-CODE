import java.util.Scanner;

public class LargestDigit {
    static int largestDigit(int n) {
        n = Math.abs(n);
        int largest = 0;

        if (n == 0) {
            return 0;
        }

        while (n != 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n /= 10;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Largest digit = " + largestDigit(n));
        sc.close();
    }
}
