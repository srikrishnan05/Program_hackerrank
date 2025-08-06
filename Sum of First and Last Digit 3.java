import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a, b;
        if (n < 0)
            n = n * -1;
        a = n % 10; 
        while (n >= 10) {
            n = n / 10;
        }
        b = n; 
        int sum = a + b;
        System.out.println(sum);
    }
}