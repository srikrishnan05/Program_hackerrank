import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int grade=x.nextInt();
    if(grade<=100 && grade>=90)
    System.out.println("Grade A");
    else if(grade<=89 && grade>=80)
    System.out.println("Grade B");
    else if(grade<=79 && grade>=70)
    System.out.println("Grade C");
    else if(grade<=69 && grade>=60)
    System.out.println("Grade D");
     else if(grade<=59 && grade>=50)
    System.out.println("Grade E");
    else
    System.out.println("Fail");
    
    }
}