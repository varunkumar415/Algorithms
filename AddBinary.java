/*
67. Add Binary

Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".

*/

public class AddBinary {
    
	public String addBinary(String a, String b) {
		StringBuilder sum = new StringBuilder("");
		
		int carry =0;
		int i = a.length()-1;
		int j = b.length()-1;
		while(i>=0 && j>=0)
		{
			int av = (a.charAt(i)==0)?0:1;
			int bv = (a.charAt(j)==0)?0:1;
			int v = av+bv+carry;
			
			sum.append(v%2);
			carry=v/2;
			i--;
			j--;
	
		}//while
		
		while(i>=0)
		{
			int av = (a.charAt(i)==0)?0:1;
			int v = av+carry;
			sum.append(v%2);
			carry=v/2;
			i--;
		}
		
		while(j>=0)
		{
			int bv = (b.charAt(j)==0)?0:1;
			int v = bv+carry;
			sum.append(v%2);
			carry=v/2;
			j--;
		}
		
		if(carry==1)
		{
			sum.append("1");
		}
		return sum.reverse().toString();
        
    }//method
	

	
}//class