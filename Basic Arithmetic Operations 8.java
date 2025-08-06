import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    int b=x.nextInt();
    int Sum=a+b;
    int difference=a-b;
    int product=a*b;
    int quotient=a/b;
    int Remainder=a%b;
    System.out.println("Sum: "+Sum);
    System.out.println("Difference: "+difference);
    System.out.println("Product: "+product);
    System.out.println("Quotient: "+quotient);
    System.out.println("Remainder: "+Remainder);

    }
}