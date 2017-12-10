/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


*/

public class StrInStr{


  public boolean hasSubstring(char[] text, char[] pattern){
        int i=0;
        int j=0;
        int k = 0;
		
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j])
			{
			
				i++;
                j++;
				
				
            }else
			{
                j=0;
                k++;
                i = k;
            }
        }//while
        if(j == pattern.length){
            return true;
        }
        return false;
    }//method
	
	
	 public static void main(String args[]){
        
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        StrInStr ss = new StrInStr();
        boolean result = ss.hasSubstring(str.toCharArray(), subString.toCharArray());
        System.out.print(result);
        
    }//main
	}//class