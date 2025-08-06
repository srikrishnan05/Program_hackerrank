import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int age=x.nextInt();
    int fit=x.nextInt();
    if(age>=18 && fit>=60)
        System.out.println("Eligible for marathon");
    else
        System.out.println("Not eligible for marathon");
    }
}