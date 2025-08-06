import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int sum=0;
        int num=x.nextInt();
        if(num<0)
            num=num*(-1);
        while(num!=0){
            int i=num%10;
            sum=sum+i;
            num=num/10;
        }
        System.out.println(+sum);
    }
}