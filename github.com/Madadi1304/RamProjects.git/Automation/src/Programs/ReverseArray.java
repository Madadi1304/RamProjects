//Program to reverse the elements of an array

package Programs;

import java.util.Scanner;

public class ReverseArray {
	public static void reverse(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=scn.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements into the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }

        reverse(arr);
        System.out.println("After reversing the array:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]=%d\n",i,arr[i]);
        }
    }   
}
