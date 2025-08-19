package JAP82.OOPs.ClassMethod;

class Palindrome {
    boolean checkPalindromeNumber(int n) {
        int sum=0, temp=n;
        while(n!=0)
        {
            sum*=10;
            sum+=n%10;
            n/=10;
        }
        return sum==temp;
    }

    int findNthPalindrome(int n) {
        int count = 0, a = 0;
        while (true) {
            if (checkPalindromeNumber(a)) {
                count++;
            }
            if (count == n) {
                break;
            }
            a++;
        }
        return a;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();
        // System.out.println(p1.checkPalindromeNumber(1231));
        for (int i = 1; i <= 100; i++) {
            if (p1.checkPalindromeNumber(i)) {
                System.out.println(i);
            }
        }

        System.out.println(p1.findNthPalindrome(65));
    }
}
