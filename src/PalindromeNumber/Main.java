package PalindromeNumber;

//Determine whether an integer is a palindrome. Do this without extra space.
public class Main {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return x == res || x == res / 10;
    }

    public static void main(String[] args) {
        System.out.println(new Main().isPalindrome(121));
    }
}
