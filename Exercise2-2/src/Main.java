import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.next();
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);

        }
        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;

            }
        }
        if(palindrome) {
            System.out.println("It Is Palindrome");
        } else  {
            System.out.println("It Is Not Palindrome");
        }
    }
}