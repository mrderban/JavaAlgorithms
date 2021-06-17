package isPalindrome;

public class IsPalindromeAlgorithm {

    public static boolean isPalindrome(int x) {
        final String s = String.valueOf(x);
        final int length = s.length();
        final int sliderMaxValue = length/2;
        for(int slider=0; slider < sliderMaxValue +1; slider++){
            if (s.charAt(slider) != s.charAt(length - 1 - slider)){
                   return false;
            }
        }
        return true;
    }
}
