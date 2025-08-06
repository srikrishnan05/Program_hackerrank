import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int num=x.nextInt();
        int count=0;
        if(num==0){
            count=1;
        }
        else{
        while(num!=0){
            
            count++;
            num=num/10;
        }
        }
        System.out.println(+count);
    }
       
}