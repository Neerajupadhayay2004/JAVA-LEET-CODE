import java.util.Scanner;

public class PerfectNumberMethod {

    static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }

        sc.close();
    }
}
