import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
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
