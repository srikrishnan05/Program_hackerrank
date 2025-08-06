import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}