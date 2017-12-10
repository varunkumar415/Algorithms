/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.


*/

class LengthOfLastWord {
    public int lengthOfLastWordMethod(String s) {
		if(s==null || s.length()==0)
		{
			return 0;
		}
		String[] strArr = s.split("\\s+");
		int lastWordlength = 0;
		if(strArr.length==0)
		{
			return 0;
		}
		else
		{
			lastWordlength = strArr[strArr.length-1].length();
		}
        return lastWordlength;
    }//method
	
		
	public static void main(String[] args){
		LengthOfLastWord obj = new LengthOfLastWord();
		String inputStr = "Hello World man";
		int strLen = obj.lengthOfLastWordMethod(inputStr); 
		System.out.println(strLen);
		
	}//main
	
}//class