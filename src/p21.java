import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		char ans = (res == 1)?'A':'B';
		
		System.out.println("��ܤF" + ans + "���u");
	}

}
