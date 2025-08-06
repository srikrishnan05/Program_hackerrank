import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        for (int i = 1; i <= 10; i++) {
            int a = n * i;
            System.out.println(n + " * " + i + " = " + a);
        }
    }
}
