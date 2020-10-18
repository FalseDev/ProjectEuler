public class Sol5 {
    public static void main(String[] args) {
        System.out.println(solution(1, 20));
    }

    private static long solution(int start, int stop) {
        long number = start;
        for (long i = start; i < stop + 1; i++) {
            number = lcm(number, i);
        }

        return number;
    }

    private static long lcm(long a, long b) {
        return (a * b) / hcf(a, b);
    }

    private static long hcf(long a, long b) {
        if (a % b == 0)
            return b;
        return hcf(b, a % b);
    }
}
