class Solution {
    public static boolean isPalindrome(String s) {
            // turn string into array of char
            char[] palindrome = buildArray(s);
    
            // make a second array that flips the first
            String reversed = new StringBuilder(s).reverse().toString();
            char[] reversed_palindrome = buildArray(reversed);

            System.out.println(Arrays.toString(palindrome));
            System.out.println(Arrays.toString(reversed_palindrome));
    
            // compare, return true if they match
            return Arrays.equals(palindrome, reversed_palindrome);
        }
    
        public static char[] buildArray(String s)
        {
            s = s.replaceAll("[^a-zA-Z0-9]", "");

            s = s.toLowerCase();

            return s.toCharArray();
        }
    }
    
    public class ValidPalindrome
    {
        public static void main(String[] args)
        {
            String s = "Was it a car or a cat I saw?";
            System.out.println(Solution.isPalindrome(s));
    }
}