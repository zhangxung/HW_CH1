import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p28 
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("�z��J���Ʀr�O:"+num);
		
		System.out.println("�п�J�r��");
		
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		
		System.out.println("����J���r��O:"+str2);
	}

}
