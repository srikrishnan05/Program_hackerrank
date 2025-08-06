import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int r=x.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}