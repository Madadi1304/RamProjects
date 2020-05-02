package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {

	public static void main(String[] args) throws IOException {
		String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String:");
        str = br.readLine();
        int count=0, size= 0;
        do
        {
             char name[] = str.toCharArray();
             size = name.length;
             count = 0;
             for(int j=0; j < size; j++)
             {
                  if((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
                  count++;
             }
             if(count!=0)
                  System.out.println(name[0]+" "+count+" Times");
             str = str.replace(""+name[0],"");          
        }
        while(size != 1);

	}

}
