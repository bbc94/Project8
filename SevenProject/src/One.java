import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		int x =0,y=0,z=0;
		try {										//try���Դϴ�.
		Scanner input =new Scanner(System.in);		
		System.out.println("�����ΰ� �Է�:");
		x=input.nextInt();
		y=input.nextInt();
		z=x*y;
		}catch(Exception e){						//����ó���� �ϴ� �ڵ��Դϴ�.
			System.out.println("������ �Է����ּ���"+e);
		}finally {
			System.out.printf("%d*%d = %d %n",x,y,z);
		}
	
	}

}
