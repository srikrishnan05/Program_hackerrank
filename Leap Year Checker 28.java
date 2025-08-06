import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int year=x.nextInt();
    if(year%4==0 && year%100!=0 || year%400==0)
        System.out.println("Leap Year");
    else
        System.out.println("Not a Leap Year");
 
    }
}