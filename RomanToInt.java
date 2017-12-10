/*
I 1
V 5
X 10
L 50
C 100
D 500
M 100
MCMXCV 1995

*/



import java.io.*;
import java.util.*;

public class RomanToInt{

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			System.out.println("Int conversion of Roman value is: "+romanToInt(input));
			
			
		}

		public static int romanToInt(String s) {
			if(s == null){
				return 0;
			}
			
			int length = s.length();
			int sum = 0;
			int pre = 0;
			
			for(int i = length - 1; i >= 0; i--){
				int cur = romanTable(s.charAt(i));
				
				if(i == length - 1){
					sum = sum + cur;
				}else{
				   if(cur < pre){
					   sum = sum - cur;
				   }else{
					   sum = sum + cur;
				   }
				}
				pre = cur;
			}//for
			
			return sum;
		}//method

		public static int romanTable(char c){
			int num = 0;
			switch(c){
				case 'I':
					num = 1;
					break;
				case 'V':
					num = 5;
					break;
				 case 'X':
					num = 10;
					break;
				 case 'L':
					 num = 50;
					 break;
				 case 'C':
					 num = 100;
					 break;
				 case 'D':
					 num = 500;
					 break;
				 case 'M':
					 num = 1000;
					 break;
				 default:
					 num = 0;
					 break;
			}
			return num;
		}	
	
}