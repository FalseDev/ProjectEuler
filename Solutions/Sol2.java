public class Sol2 {
    public static void main(String[] args) {
        long sum = 0;
        long last1 = 1;
        long last2 = 1;
        while (last2 < 4000000) {
            long newNum = last1 + last2;
            last1 = last2;
            last2 = newNum;
            if (last2 % 2 == 0) {
                sum += last2;
            }
        }
        System.out.println(sum);
    }

}
