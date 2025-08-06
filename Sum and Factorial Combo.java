import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int sum=0;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            fact=fact*i;
        }
        System.out.println(sum);
        System.out.println(fact);
    }
}