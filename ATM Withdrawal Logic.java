import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int amt=x.nextInt();
        x.nextLine();
        String status=x.nextLine();
        if(status.equals("available")&&(amt%100==0)){
            System.out.println("Amount "+amt+ " can be withdrawn");
        }
        else if(status.equals("not available")&&(amt%500==0)){
           System.out.println("Amount "+amt+ " can be withdrawn"); 
        }
        else{
          System.out.println("Enter amount in multiples of 500");
        }
        }
            
        }