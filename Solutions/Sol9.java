import java.io.IOException;

public class Sol9 {
    public static void main(String[] args) {
        int answer = solution();
        if (answer == 0)
            System.out.println("Unable to find");
        else
            System.out.println(answer);
    }

    public static int solution() {
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                int r = (int) Math.sqrt(i * i + j * j);
                if (r * r != i * i + j * j)
                    continue;
                if (i + j + r == 1000) {
                    System.out.println(i + " " +  j + " " + r);
                    return r * i * j;
                }
            }
        }
        return 0;
    }
}
