import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    int b=x.nextInt();
    int c=x.nextInt();
        if(a==b||b==c||a==c) {
            System.out.println("There is a tie for the greatest number");
        }
        else {
        if(a>b) {
            if(a>c) {
                System.out.println(a+" is the greatest");
            }
            else {
                System.out.println(c+" is the greatest");
            }
        }
        else if(b>c) {
        
            System.out.println(b+" is the greatest");
        }
        else {
            System.out.println(c+" is the greatest");
        }
        
    }

}
}


