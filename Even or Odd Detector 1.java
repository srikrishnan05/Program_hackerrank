import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int num=x.nextInt();
    if(num%2==0)
        System.out.println("Even");
    else
        System.out.println("Odd");
    }
}