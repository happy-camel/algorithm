import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = scanner.nextInt();
        int chageyoungscore = 100;
        int sangduckscore = 100;

        for (int i =0; i < round; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == b) {
                continue;
            } else if (a > b) {
                sangduckscore = sangduckscore - a;
            } else if (a < b) {
                chageyoungscore = chageyoungscore - b;
            }
        }

        System.out.println(chageyoungscore);
        System.out.println(sangduckscore);
    }
}