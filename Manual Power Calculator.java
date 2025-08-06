import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     int b=x.nextInt();
     int e=x.nextInt();
     int res=1;
     for(int i=1;i<=e;i++)
         res=res*b;
        System.out.println(res);
    }
}