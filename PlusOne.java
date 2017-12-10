/*
66. Plus One
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

*/

class PlusOne {
    public int[] plusOneMethod(int[] digits) {
		for(int i=digits.length-1;i>=0;i--)
		{
			if(digits[i]<9)
			{
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}//for
		digits = new int[digits.length+1];
		digits[0]=1;
		return digits;
    }//method
	
		
	public static void main(String[] args){
		PlusOne obj = new PlusOne();
		int[] input_arr = {9,9,9,9};
		int[] outputArr = obj.plusOneMethod(input_arr); 
		for(int i=0;i<outputArr.length;i++)
		System.out.print(outputArr[i]);
		
	}//main
	
}//class