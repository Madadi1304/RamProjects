//Program is used to print Invert Triangle

package Programs;

public class InvertTriangle {

	public static void main(String[] args) {
		int num = 9;
        while(num > 0)
        {
            for(int i=1; i<=num; i++)
            {
                System.out.print(" "+num+" ");
            }
            System.out.print("\n");
            num--;
        }

	}

}
