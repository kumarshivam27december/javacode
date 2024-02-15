public class palindrome {
    public static Boolean isPalindrome(int number){
        if(number < 0) return false; // negative numbers are not considered as palindromes.
        if(number == 0) return true; // 0 is considered a palindrome.
        int temp = number;
        int rev = 0;
        while(temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return number == rev;
    }

    public static void main(String[] args) {
        int number = -333;
        if (isPalindrome(number)) {
            System.out.println("The given number is a Palindrome Number");
            
        } else {
            System.out.println("The given number is not a Palindrome Number");
            
        }
        
    }
}
