package Programs;

import java.util.Scanner;

class Trial
{
      public static String reverseString(String s)
      {
            String[] str1 = s.split(" ");
            String result1 = "";
            for (int i = str1.length-1; i >= 0; i--)
            {
                   result1 += str1[i]+" ";
            }
            return result1;
      }
      public static void main(String args[])
      {
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Enter the String: ");
           String str = sc1.nextLine();
           String result = Trial.reverseString(str);
           System.out.println("\nGiven String: "+str);
           System.out.println("\nReverse String: "+result);
     }
}

