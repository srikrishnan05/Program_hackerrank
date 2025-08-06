import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().trim();
        int follower=sc.nextInt();
        int posts=sc.nextInt();
        float hours=sc.nextFloat();
        System.out.println("My name is "+name+", my Instagram has "+follower+" followers, I have posted "+posts+" posts, and I use Instagram for "+hours+" hours daily.");
    }
}