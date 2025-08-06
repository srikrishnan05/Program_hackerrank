import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+a;
            n/=10;
        }
            if(temp%sum==0){
                System.out.println("Harshad Number");
            }
            else
            {
                System.out.println("Not Harshad Number");
            }
        }
}