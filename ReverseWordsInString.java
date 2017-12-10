/*
151. Reverse Words in a String
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

*/

public class ReverseWordsInString {
    
	public static void main(String[] args)
	{
		System.out.println(reverseWords("the sky is blue"));
	}
	
	public static String reverseWords(String s) 
	{
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] sa = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = sa.length - 1; i >= 0; i--) 
		{
			if (!sa[i].equals("")) 
			{
				sb.append(sa[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		//return sb.toString();
        
    }//method
}//class