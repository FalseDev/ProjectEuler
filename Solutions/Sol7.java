public class Sol7 {
    public static void main(String[] args) {
        System.out.println(nth_prime(10001));
    }

    public static long nth_prime(long n) {
        long i = 0;
        while (n != 0) {
            i++;
            if (is_prime(i))
                n--;
        }
        return i;
    }

    public static boolean is_prime(long input) {
        if (input < 2) {
            return false;
        }
        if (input == 2) {
            return true;
        }
        double limit = Math.ceil(Math.sqrt(input));
        for (double i = 2; i <= limit; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

}
