
public class p49 {

	public static void main(String[] args) 
	{
		int[][]test = new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 60;
		test[0][2] = 22;
		test[0][3] = 50;
		test[0][4] = 75;
		test[1][0] = 90;
		test[1][1] = 55;
		test[1][2] = 68;
		test[1][3] = 72;
		
		for(int i=0;i<test[1].length;i++)
		{
			System.out.println("��" + (i+1) + "�ӤH�������ƬO" + test[0][i] + "��");
			System.out.println("��" + (i+1) + "�ӤH���ƾǤ��ƬO" + test[1][i] + "��");
		}

	}

}
