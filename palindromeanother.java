import java.io.*; 
import java.util.*;

public class Solution {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        String reversed = new StringBuilder(A).reverse().toString();
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
