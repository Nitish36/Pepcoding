import java.util.*;

public class Main {
  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static char swap(char arr[],int left,int right)
  {
      char temp;
      temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      
      return temp;
  }
  
  public static boolean isVowel(char arr[],int n) 
  {
      if(arr[n]=='a' || arr[n]=='e' || arr[n]=='i' || arr[n]=='o' || arr[n]=='u' ||arr[n]=='A' || arr[n]=='E' || arr[n]=='I' || arr[n]=='O' || arr[n]=='U')
      {
          return true;
      }
      return false;
  }
  public static String reverseVowels(String s) {
    // write your code here
    char arr[] = s.toCharArray();
    int left = 0; 
    int right =  arr.length-1;
    
    while(left<right)
    {
        while(left < right && isVowel(arr,left)==false)
        {
            left++; 
        }
        while(left < right && isVowel(arr,right)==false) 
        {
            right--;
        } 
        swap(arr,left,right);
        left++;
        right--;
    }
    String str = "";
    for(char ch: arr)
    {
        str+=ch;
    }
    return str;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
  }
}
