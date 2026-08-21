import java.util.Scanner;

public class LargestAmongThreeMethod {
    static int largest(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Largest = " + largest(a, b, c));
        sc.close();
    }
}
