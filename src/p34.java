
public class p34 
{

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1�Mnum2���U�عB��:");
		System.out.println("num1+num2����"+(num1+num2));
		System.out.println("num1-num2����"+(num1-num2));
		System.out.println("num1*num2����"+(num1*num2));
		System.out.println("num1/num2����"+(num1/num2));
		System.out.println("num1%num2����"+(num1%num2));
		
		int a = 0,b = 0,c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("�]���O�b���w�Ȥ���~���W�A�ҥHb���Ȭ�"+b);
		System.out.println("�]���O�b���W����~���w�ȡA�ҥHc���Ȭ�"+c);
	}

}
