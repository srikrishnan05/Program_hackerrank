import java.io.*;
import java.util.*;

public class Solution {
public static int count(int n)
     {
       int c=0;
        while(n!=0){
          c++;
          n/=10;
        }
        return c;
      }
public static int findsum(int n,int c){
    int sum=0;
    while(n!=0){
        int last=(n%10);
        sum=sum+(int)Math.pow(last,c);
        n=n/10;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int c= count(n);
        int sum=findsum(n,c);
        if(sum==n)
            System.out.println("true");
        else
            System.out.println("false");
    }
}