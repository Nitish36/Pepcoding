package strings;
import java.util.*;
public class Toggle {
	
	public static String toggleCase(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			char c=' ';
			if(ch>='A' && ch<='Z')
			{
				c = (char)(ch+32);
				result+=c;
			}
			if(ch>='a' && ch<='z')
			{
				c = (char)(ch-32);
				result+=c;
			}
			if(ch == ' ')
			{
				result+=ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(toggleCase(str));
		scn.close();
	}

}
