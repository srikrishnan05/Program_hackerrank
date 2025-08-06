import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            
            System.out.println("Not a valid triangle");
        }

    }
}
