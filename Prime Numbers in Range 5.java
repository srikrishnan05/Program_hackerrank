import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int totalPrimes = 0; 

        for (int i = start; i <= end; i++) {
            int count = 0;

            if (i < 2)
                continue;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
                totalPrimes++; 
            }
        }

        if (totalPrimes == 0) {
            System.out.print("No prime numbers");
        }
    }
}
