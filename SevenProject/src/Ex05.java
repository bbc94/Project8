import java.util.*;

class  PrintTime implements Runnable{
	int n;
	public PrintTime(int n) {									//������ �ڵ��Դϴ�.
		this.n=n;
	}
	public PrintTime(int n,String name) {						//������ �ڵ��Դϴ�.
		this.n=n;
		Thread.currentThread().setName(name);
	}
	public void run() {
		GregorianCalendar now = new GregorianCalendar();		//��¥�� �ޱ����� ��ü�����ڵ��Դϴ�.
		Date date = now.getTime();								//��ü�� ��¥���޴� �ڵ��Դϴ�.
		String a = Thread.currentThread().getName();
		int b = Thread.currentThread().getPriority();
		for(int i=0;i<n;i++) {
			System.out.println("����:"+b+" "+date+a);
		}
	}
}
public class Ex05 {
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1,"�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2,"�ݰ����ϴ�");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
		
	}
}