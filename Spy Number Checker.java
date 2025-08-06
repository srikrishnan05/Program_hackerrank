import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int sum=0;
        int pro=1;
       while(n!=0){
            int num=n%10;
            sum=sum+num;
            pro=pro*num;
            n=n/10;
        }
        if(sum==pro){
            System.out.println("Spy Number");
        }
        else
            System.out.println("Not a Spy Number");
        }
}