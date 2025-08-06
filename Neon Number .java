import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        int a=N*N;
        while(a!=0){
            int r=a%10;
        sum=sum+r;
            a/=10;
    }
    if(sum==N)
        System.out.println("true");
    else
        System.out.println("false");
}
}