import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;;

public class p47 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J5�ӤH������");
		Integer []test = new Integer[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++)
		{
			System.out.println("��" + (i+1) + "�W�����ƬO" + test[i]);
		}

	}

}
