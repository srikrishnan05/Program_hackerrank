import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int r = x.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r - 2; i >= 0; i--) {
            for (int j = 0; j < r - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
