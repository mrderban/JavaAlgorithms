package longestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefixAlgorithm {

    public static String getLongestCommonPrefix(String[] strings) {
        String commonPrefix ="";

        int charSlider = 0;
        while(true) {
            try {
                char referenceChar = strings[0].charAt(charSlider);
                for (String string : strings) {
                    if (referenceChar != string.charAt(charSlider)) {
                        return commonPrefix;
                    }
                }
                commonPrefix = commonPrefix.concat(String.valueOf(referenceChar));
                charSlider++;

            } catch(Exception e) {
                return commonPrefix;
            }
        }
    }
}
