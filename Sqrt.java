/*
69. Sqrt(x)
Implement int sqrt(int x).

Compute and return the square root of x.

Algo: Use binary search
Use binary search to find the square root.
1. Initialize, start = 0, end = number, mid = (start+end)/2.
2. Set prevMid = 0, as the previous mid value.
3. Find diff = absolute difference between prevMid and mid.
4. While mid is not the square root of number (i.e. mid*mid != number) and difference diff is greater than 0.0005, 
repeat the following steps:
   a. If mid*mid > number, then the square root will be less than mid. So, set end = mid.
   b. Else, the square root will be greater than mid. So, set start = mid.
   c. Set prevMid = mid
   d. Re-evaluate mid  = (start+end)/2.
   e. Re-evaluate diff from prevMid and mid.

*/

class Sqrt {
    public String mySqrt(int x) {
		boolean isNegative = false;
		if(x<0)
		{
			x=-x;
			isNegative = true;
		}
		
		if(x==1)
		{
			return x + (isNegative? "i" : "");
		}
		double start = 0, end=x, mid=(start+end)/2, prevMid = 0;
		double diff = Math.abs(mid-prevMid);
		double precision = 0.0005;
		
		while(mid*mid!=x && diff>precision)
		{
			if(mid*mid>x)
			{
				end=mid;
			}
			else
			{
				start=mid;
			}
			prevMid=mid;
			mid=(start+end)/2;
			diff=Math.abs(mid-prevMid);
			
		}//while
		
		//int sqrt = (int)mid;
		return mid +(isNegative? "i" : "");
        
    }//method

    public int method2(int x) {
        long start = 0;
        long end = x / 2 + 1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == x)
                return (int)mid;
            if (mid * mid < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int)end;
    }

	
	
		public static void main(String[] args){
		Sqrt obj = new Sqrt();
		String output = obj.mySqrt(2); 
		System.out.println(output);	
		System.out.println(obj.method2(2));
	}//main
	
}//class