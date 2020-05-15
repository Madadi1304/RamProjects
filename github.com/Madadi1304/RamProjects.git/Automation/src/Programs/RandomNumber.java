//Program generates random numbers within the provided range.

package Programs;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }

	}

}
