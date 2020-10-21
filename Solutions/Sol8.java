import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Sol8 {
    static String input;

    public static void main(String[] args) {
        try {
            input = new String(Files.readAllBytes(Paths.get("./data/problem-8.txt")));
        } catch (IOException exception) {
            System.out.println(exception);
            System.exit(1);
        }

        String numbers = String.join("", input.split("\n"));

        System.out.println(solution(numbers));
    }

    private static long solution(String numbers) {

        long max = 0;

        for (int i = 0; i < numbers.length() - 13; i++) {
            long num = 1;
            String inp = numbers.substring(i, i + 13);
            for (int j = 0; j < inp.length(); j++) {
                num *= inp.charAt(j) - '0';
            }
            if (num > max)
                max = num;
        }
        return max;
    }

}
