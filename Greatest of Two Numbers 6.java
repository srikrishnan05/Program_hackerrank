import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    int b=x.nextInt();
    if(a!=b){
        if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
    }
        else{
            System.out.println("Both are equal");
        }
    }
}