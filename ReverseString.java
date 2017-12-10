/*
344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

class ReverseString {
	
	public static void main(String[] args)
	{
		System.out.println("using swap "+reverseString("hello"));
		System.out.println("using recursion "+reverseString2("hello"));
		System.out.println("using half iteration "+reverseString3("hello"));
		
	}
	
    public static String reverseString(String s) 
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		
		char[] ca = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		
		while(start<end)
		{
			swap(ca, start, end);
			start++;
			end--;
		}
		
		//String s1 = String.valueOf(ca);
		//return s1;
		return new String(ca);
        
    }//method
	
	public static void swap(char[] ca, int start, int end)
	{
		char temp = ca[start];
		ca[start] = ca[end];
		ca[end] = temp;
	}
	
	//using recursion
	public static String reverseString2(String input){
		
		if((null==input) || (input.length()<=1))
		{
			return input;
		}
		
		return reverseString(input.substring(1)) +input.charAt(0); //recursion
		
	}
        // iterrate half length of string	
		public static String reverseString3(String input){
		
		int len = input.length();
		char[] a = input.toCharArray();
		char temp;
		for(int i=0;i<len/2;i++)
		{
			temp=a[i];
			a[i]=a[len-1-i];
			a[len-1-i]=temp;
			
		}
		String revstr = new String(a);
		return revstr;
		
	}
	
	
}//class