public class Sol4 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = i * j;
                if (max < num) {
                    if (is_palindrome(num)) {
                        max = num;
                    }
                }
            }
        }

        System.out.println(max);
    }

    private static boolean is_palindrome(int input) {
        int remainder;
        int reversedN = 0;
        int n = input;
        while (n != 0) {
            remainder = n % 10;
            reversedN = reversedN * 10 + remainder;
            n /= 10;
            // System.out.print(n);
        }
        return (reversedN == input);
    }

}