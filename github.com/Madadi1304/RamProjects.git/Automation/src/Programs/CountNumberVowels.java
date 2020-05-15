//Program to count the number of vowels in a given string and print them

package Programs;

import java.util.Scanner;

public class CountNumberVowels {

	public static void main(String[] args) {
		int count = 0;
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine().toLowerCase();
        for (int i = 0; i< str.length(); i++ )
        {
             for (int j = 0; j < 5; j++)
             {
                  if (str.charAt(i) == vowels[j])
                  {
                       count++;
                  }
             }
        }
        if (count > 0)
        {
             System.out.println("Total vowel present in given string : "+count);
        }
        else
             System.out.println("no vowels present in given string.");
	}

}
