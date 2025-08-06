import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
            int last=n%10;
            if(n%7==0 || last==7)
                System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz Number");
    }
}