package Palindrome;

public class Palindromic
{


    public String longestPalindrome(String s) {

    }

    public boolean isPalindrome(String s)
    {
        boolean answer = true;

        for (int i = 0, j = s.length() - 1; answer && i < s.length(); i++, j--)
        {

            String firstChar = s.substring(i, i + 1);
            String secondChar = s.substring(j - 1, j);

            if (!firstChar.equals(secondChar))
            {
                answer = false;
            }
        }
        return answer;
    }
}

class PalindromicTesters
{
    public static void main(String[] argsgsg)
    {

    }
}
