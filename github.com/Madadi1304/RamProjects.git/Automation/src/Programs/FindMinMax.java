package Programs;

public class FindMinMax {

	public static void main(String[] args) {
		int a = 11;
        int b = 19;
        int c = 15;
        System.out.println("The Numbers are a= "+a+" b= "+b+" c= "+c);
        int max = (a>b ? (a>c ? a : c): (b>c ? b : c));
        System.out.println("Max= "+max);
        int min = (a<b ? (a<c ? a : c): (b<c ? b : c));
        System.out.println("Min= "+min);

	}

}
