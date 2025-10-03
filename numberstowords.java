import java.util.*;

public class NumberToWords {
    private static final String[] ones = {
        "zero","one","two","three","four","five","six","seven","eight","nine",
        "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
        "seventeen","eighteen","nineteen"
    };
    private static final String[] tens = {
        "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
    };
    public static String convert(int num) {
        if (num < 20) {
            return ones[num];
        } else if (num < 100) {
            return tens[num/10] + (num % 10 != 0 ? " " + ones[num%10] : "");
        } else if (num < 1000) {
            return ones[num/100] + " hundred" + 
                   (num % 100 != 0 ? " and " + convert(num % 100) : " only");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number (0–999): ");
        int num = sc.nextInt();
        
        String words = convert(num);
        int count = words.replace(" ", "").length();
        
        System.out.println("Output count = " + count);
        System.out.println("In words = " + words);
    }
}
