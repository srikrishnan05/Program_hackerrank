import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int temp = num;
        int sq = temp * temp;
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        int a = (int)Math.pow(10, count); 
        int b = sq % a;

        if (b == temp) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}
