public class RepeatedDigits1To100 {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            int temp = number;
            boolean repeated = false;

            while (temp != 0) {
                int digit = temp % 10;
                int remaining = temp / 10;

                while (remaining != 0) {
                    if (digit == remaining % 10) {
                        repeated = true;
                        break;
                    }
                    remaining /= 10;
                }

                if (repeated) {
                    break;
                }
                temp /= 10;
            }

            if (repeated) {
                System.out.println(number);
            }
        }
    }
}
