public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }
  public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
