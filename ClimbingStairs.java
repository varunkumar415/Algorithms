/*
DP - use for fibonaci, to find shortest path

70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

solution : similar to fibonacci

Algo: recursive approach, memorization approach, DP approach, iterative approach
base conditions must be correct.
*/

class ClimbingStairs {
	//using recursion
    public int climbStairs(int n) {
		if(n<0)
		{
			return 0;
		}
		else if(n==0)
		{
			return 1;
		}
		return climbStairs(n-1)+climbStairs(n-2);
		
        
    }//method
	
	   public int climbStairs2(int n) {
		if(n<=0)
		{
			return 0;
		}
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return climbStairs2(n-1)+climbStairs2(n-2);
		
        
    }//method
	
	
	public static void main(String[] args){
		ClimbingStairs obj = new ClimbingStairs();
		int output = obj.climbStairs(7);
		//int output2 = obj.climbStairs2(7);		
		System.out.println(output);	
		
	}//main
}//class