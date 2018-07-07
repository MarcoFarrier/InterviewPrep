import static org.junit.Assert.*;

public class longestSubstringTest {

    @org.junit.Test
    public void oneTest()
    {
        String testString = "aab";

        longestSubstring myClass = new longestSubstring();
        myClass.lengthOfLongestSubstring(testString);

    }

}