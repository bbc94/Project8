class PrimeNumber1 implements Runnable{							//�Ҽ� ���ϴ� Ŭ�����Դϴ�
	int num =0;
	public PrimeNumber1(String name) {							//������ �Դϴ�.
		Thread.currentThread().setName(name);
	}
	public PrimeNumber1(int num) {								//������ �Դϴ�.
		this.num=num;
	}
	public PrimeNumber1(int num,String name) {					//������ �Դϴ�.
		this.num=num;
		Thread.currentThread().setName(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=num;i++) {								//�Ҽ����ϴ� �˰����Դϴ�.
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
public class ex04 {
	
	public static void main(String[] args) {

		new Thread(new PrimeNumber1(25),"�Ҽ� ����� ������").start();
	}

}
