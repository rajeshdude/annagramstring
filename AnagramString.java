import java.util.*;
import java.lang.*;
import java.io.*;

class AnagramString
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input = new Scanner(System.in);
    String text = input.next();   
	String pattern = input.next();
    anagram(text,pattern);
	}
	
	private static boolean comp(int[] intext , int[] inpath){
	for(int i = 0; i < intext.length; i++){
		if(intext[i] != inpath[i]){
			return false;
		}
	}
	return true;
    }

    public static void anagram(String text, String pattern){
    	int count = 0;
    	int n = text.length();
    	int m = pattern.length();
    	
    	if(n < m){
    	 System.out.println("pattern length is more than text length");	
    	}
    		
    	int itext[] = new int[256]; 
    	int ipath[] = new int[256];
    	int i = 0;
    	for(i = 0; i < m; i++){
    		ipath[pattern.charAt(i)]++;
    		itext[text.charAt(i)]++;
    	}
    	do{
    		if(comp(itext, ipath)){
    			System.out.println("True");
    			break;
    		}
    		itext[text.charAt(i)]++;
    		itext[text.charAt(i-m)]--;
    	} while(++i < n);
    }
	
}
