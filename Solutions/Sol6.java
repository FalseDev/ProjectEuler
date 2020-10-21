public class Sol6 {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static long solution(int a) {
        return square_of_sums(a) - sum_of_squares(a);
    }

    private static long sum_of_squares(int stop) {
        long total = 0;

        for (int i = 1; i < stop + 1; i++) {
            total += Math.pow(i, 2);
        }

        return total;
    }

    private static long square_of_sums(int num) {
        long val = (num * (num + 1)) / 2;
        return val * val;
    }
}
