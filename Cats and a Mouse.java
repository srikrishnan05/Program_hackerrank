import java.io.*;
import java.util.*;

public class Solution {
    static String catAndMouse(int x, int y, int z) {
        int distanceCatA = Math.abs(z - x);
        int distanceCatB = Math.abs(z - y);

        if (distanceCatA < distanceCatB) {
            return "Cat A";
        } else if (distanceCatB < distanceCatA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int q = scanner.nextInt();
        scanner.nextLine(); 
        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]); 
            int y = Integer.parseInt(xyz[1]); 
            int z = Integer.parseInt(xyz[2]); 
            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }
}
