//Program to swap two numbers without using the third variable

package Programs;

import java.util.Scanner;

public class SwapTwoNumbersWithNoThird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of x and y");  
         /*Define variables*/  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("Before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping numbers: "+x +" "+ y);   
	}

}
