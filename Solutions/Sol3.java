import java.util.Arrays;

public class Sol3 {
    public static void main(String[] args) {
        long pfs[] = prime_factors(600851475143L);

        System.out.println(pfs[pfs.length - 1]);
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

    public static long[] prime_factors(long input) {
        double limit = Math.ceil(Math.sqrt(input));
        long factors[] = {};
        long p_factors[] = {};

        // Get all factors below limit
        for (int i = 2; i <= limit; i++) {
            if (input % i == 0) {
                factors = add_element_to_array(factors, i);
            }
        }

        // Get other factors above limit
        for (int i = factors.length - 1; i >= 0; i--) {
            if (input / factors[i] == limit)
                continue;
            factors = add_element_to_array(factors, input / factors[i]);
        }

        // Filter only prime factors
        for (int i = 0; i < factors.length; i++) {
            if (is_prime(factors[i]))
                p_factors = add_element_to_array(p_factors, factors[i]);
        }

        return p_factors;
    }

    public static long[] add_element_to_array(long[] factors, long i) {
        factors = Arrays.copyOf(factors, factors.length + 1);
        factors[factors.length - 1] = i;
        return factors;
    }
}
