import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.trim().split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
