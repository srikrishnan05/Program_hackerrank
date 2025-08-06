import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    char ch=x.next().charAt(0);
    if(ch>='A' && ch<='Z')
        System.out.println("Uppercase Alphabet");
    else if(ch>='a' && ch<='z')
        System.out.println("Lowercase Alphabet");
    else if(ch>='0' && ch<='9')
        System.out.println("Digit");
    else
        System.out.println("Special Character");

    }
}