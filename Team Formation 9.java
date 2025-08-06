import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int total_team=x.nextInt();
    int players=x.nextInt();
    int total_team_formed=total_team/players;
    int players_left=total_team%players;
    System.out.println("Total teams formed: "+total_team_formed);
    System.out.println("Players left out: "+players_left);
    }
}