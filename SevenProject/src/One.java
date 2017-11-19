import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		int x =0,y=0,z=0;
		try {										//try문입니다.
		Scanner input =new Scanner(System.in);		
		System.out.println("정수두개 입력:");
		x=input.nextInt();
		y=input.nextInt();
		z=x*y;
		}catch(Exception e){						//예외처리를 하는 코드입니다.
			System.out.println("정수를 입력해주세요"+e);
		}finally {
			System.out.printf("%d*%d = %d %n",x,y,z);
		}
	
	}

}
