package Arrays;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String word) {

        word = word.toLowerCase();
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Palindrome check = new Palindrome();

        System.out.println("Enter the word : ");
        String word = sc.nextLine();
        
        if (check.isPalindrome(word)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        sc.close();
    }
}
