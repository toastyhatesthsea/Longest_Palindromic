package Palindrome;

public class Palindromic
{


    public String longestPalindrome(String s) {

        String answer = "";
        int longestLength = 0;
        int anchor = 0;

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = anchor; j < s.length(); j++)
            {
                String aSubString = s.substring(i, j);

                if (isPalin(aSubString) && (j + 1) - i > longestLength)
                {
                    answer = aSubString;
                    longestLength = (j + 1) - i;
                    anchor = longestLength - 1;
                }
            }
        }


        return "";
    }

    public boolean isPalindrome(String s)
    {
        boolean answer = true;

        if (s.length() == 1)
        {
            return answer;
        }

        for (int i = 0, j = s.length() - 1; answer && i < s.length() && i != j && i < j; i++, j--)
        {

            String firstChar = s.substring(i, i + 1);
            String secondChar = s.substring(j, j+ 1);

            if (!firstChar.equals(secondChar))
            {
                answer = false;
            }
        }
        return answer;
    }

    public boolean isPalin(String s)
    {
        if (s.length() == 1)
        {
            return true;
        }
        else if(!s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
        {
            return false;
        }
        else
        {
            return isPalin(s.substring(1, s.length() - 1));
        }
    }
}

class PalindromicTesters
{
    public static void main(String[] argsgsg)
    {
        String rawrs = "abaa";

        Palindromic palin = new Palindromic();

        palin.isPalin(rawrs);
    }
}
