import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J���");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("��J���O1");
		}
		else
		{
			System.out.println("��J���O1�H�~���Ʀr");
		}

	}

}
