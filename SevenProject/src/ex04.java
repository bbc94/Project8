class PrimeNumber1 implements Runnable{							//소수 구하는 클래스입니다
	int num =0;
	public PrimeNumber1(String name) {							//생성자 입니다.
		Thread.currentThread().setName(name);
	}
	public PrimeNumber1(int num) {								//생성자 입니다.
		this.num=num;
	}
	public PrimeNumber1(int num,String name) {					//생성자 입니다.
		this.num=num;
		Thread.currentThread().setName(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=num;i++) {								//소수구하는 알고리즘입니다.
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

		new Thread(new PrimeNumber1(25),"소수 만드는 스레드").start();
	}

}
