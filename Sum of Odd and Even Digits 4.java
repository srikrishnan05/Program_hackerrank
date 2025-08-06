
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);  // Handle negative input

        int evenSum = 0, oddSum = 0;
        if(n<0)
            n=n*(-1);
        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            n /= 10;
        }

        System.out.println(oddSum + " " + evenSum);
    }
}