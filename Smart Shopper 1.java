import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner x=new Scanner(System.in);
        int cost1=x.nextInt();
        int quantity1=x.nextInt();
        int cost2=x.nextInt();
        int quantity2=x.nextInt();
        int cost3=x.nextInt();
        int quantity3=x.nextInt();
        int budget=x.nextInt();
        double totalbill=(int)((cost1*quantity1)+(cost2*quantity2)+(cost3*quantity3));
        double tax=totalbill+(totalbill*0.10);
        System.out.printf("Total (Before Tax): %.2f\n",totalbill);
        System.out.printf("Total (After Tax): %.2f\n",tax);
        if(tax<=budget)
            System.out.println("Within Budget");
        else
            System.out.println("Over Budget");
    }
}