package strings;
import java.util.*;
public class Compression {
	
	public static String compress(String str)
	{
		String result = str.charAt(0)+"";
		
		for(int i = 1 ; i < str.length() ; i++)
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i-1);
			
			if(ch1 != ch2)
			{
				result += ch1;
			}
		}
		return result;
	}
	public static String compress2(String str)
	{
		String result = str.charAt(0)+"";
		int count = 1;
		
		for(int i = 1 ; i < str.length() ; i++)
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i-1);
			
			
			if(ch1 == ch2)
			{
				count++;
			}
			else
			{
				
				if(count>1) {
				result +=count;
				count = 1;
				}
				result +=ch1;
			}
		}
		if(count>1) {
			result +=count;
			count = 1;
			}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println(compress(str));
		System.out.println(compress2(str));
		sc.close();
	}

}
