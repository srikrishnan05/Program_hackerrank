import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 0) {
            N =N*-1;
        }
        int max= 0;
        int min= 9;
        if (N == 0) {
            max= 0;
            min= 0;
        }
        while (N > 0) {
            int a = N % 10;
            if (a > max) {
                max =a;
            }
            if (a < min) {
                min = a;
            }
            N = N / 10;
        }
        System.out.println(max + " " + min);
    }
}
