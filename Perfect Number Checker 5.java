import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int temp=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a Perfect Number");
    }
}
        