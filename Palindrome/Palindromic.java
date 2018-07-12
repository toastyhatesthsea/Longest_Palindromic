package Palindrome;

public class Palindromic
{


    public String longestPalindrome(String s) {

        String answer = "";
        int longestLength = 0;
        int anchor = 1;

        for (int i = 0; i < s.length()-1; i++)
        {
            for (int j = i+1; j <= s.length(); j++)
            {
                String aSubString = s.substring(i, j);

                if (isPalin(aSubString) && (j) - i > longestLength)
                {
                    answer = aSubString;
                    longestLength = (j - i);
                    anchor = longestLength - 1;
                }


            }
        }
        return answer;
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
        else if (s.isEmpty())
        {
            return false;
        }
        else if (s.length() == 2 && s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()) ))
        {
            return true;
        }
        else if (!s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
        {
            return false;
        } else
        {
            return isPalin(s.substring(1, s.length() - 1));
        }
    }
}

class PalindromicTesters
{
    public static void main(String[] argsgsg)
    {
        String rawrs = "civilwartestingwhetherthatnaptionoranynartionsoconceivedands";
        String aDrome = "EvaCanIStabBatsInACave";
        String secondDrome = "DocNoteIDissentAFastNeverPreventsAFatnessIDietOnCod";
        secondDrome = secondDrome.toLowerCase();
        aDrome = aDrome.toLowerCase();

        Palindromic palin = new Palindromic();

        String answer = palin.longestPalindrome(rawrs);
    }
}
