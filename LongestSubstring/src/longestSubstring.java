import java.util.HashMap;
import java.util.HashSet;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        int endIndex = 1;
        int longestIndex = 1;

        while(endIndex < s.length())
        {
            String sub;
            if(endIndex > s.length() - 1)
                sub = s.substring(startIndex);
            else {
                sub = s.substring(startIndex, endIndex);
            }
            if(isValidSubstring(sub))
            {

                if(endIndex - startIndex > longestIndex)
                {
                    longestIndex = endIndex - startIndex - 1;
                }
                endIndex++;
            }
            else {
                startIndex = endIndex - 1;
                endIndex = startIndex + longestIndex;
            }
        }

        return longestIndex;

    }

    public boolean isValidSubstring(String s)
    {
        HashSet<Character> frequency = new HashSet<Character>();

        for(char c : s.toCharArray())
        {
            if(frequency.contains(c))
                return false;
            frequency.add(c);
        }
        return true;
    }
}
