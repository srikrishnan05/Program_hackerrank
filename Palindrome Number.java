import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<0)
            System.out.println("false");
        else{
        int a=num;
        int r=0;
        while(num!=0){
            r=r*10+(num%10);
            num=num/10;
        }
        if(a==r)
            System.out.println("true");
        else
                System.out.println("false");
    }
}
}