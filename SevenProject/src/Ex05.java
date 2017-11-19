import java.util.*;

class  PrintTime implements Runnable{
	int n;
	public PrintTime(int n) {									//생성자 코드입니다.
		this.n=n;
	}
	public PrintTime(int n,String name) {						//생성자 코드입니다.
		this.n=n;
		Thread.currentThread().setName(name);
	}
	public void run() {
		GregorianCalendar now = new GregorianCalendar();		//날짜를 받기위한 객체생성코드입니다.
		Date date = now.getTime();								//객체에 날짜를받는 코드입니다.
		String a = Thread.currentThread().getName();
		int b = Thread.currentThread().getPriority();
		for(int i=0;i<n;i++) {
			System.out.println("순위:"+b+" "+date+a);
		}
	}
}
public class Ex05 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1,"안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2,"반갑습니다");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
		
	}
}