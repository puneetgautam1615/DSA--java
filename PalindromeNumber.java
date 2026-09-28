import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int org = x;
        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        return org == rev;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
