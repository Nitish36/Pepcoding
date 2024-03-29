import java.util.*;

public class Main {

  public static String addStrings(String num1, String num2) {
    // write your code here
    int i = num1.length()-1;
    int j = num2.length()-1;
    int carry=0;
    String res="";
    while(i>=0 || j>=0 || carry!=0)
    {
        int ival = i>=0?(num1.charAt(i)-'0'):0;
        int jval = j>=0?(num2.charAt(j)-'0'):0;
        i--;
        j--;
        int sum = ival+jval+carry;
        
        res = (sum%10)+res;
        carry = sum/10;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n1 = scn.nextLine();
    String n2 = scn.nextLine();

    String res = addStrings(n1, n2);
    System.out.println(res);
  }
}
