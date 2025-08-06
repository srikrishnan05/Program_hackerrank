import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        for(int i=1;i<=num;i++)
            System.out.print(i+" ");
            for(int i=num;i>=1;i--){
                System.out.print(i+ " ");
        }
    }
}