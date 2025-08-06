import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
        int r=0;
        int num=x.nextInt();
        if(num<0){
            System.out.print("-");
            num=num*-1;
        }
        if(num==0)
            r=0;
            while(num!=0){
            r=r*10+(num%10);
            num=num/10;
        }
          System.out.print(r);
    }
}