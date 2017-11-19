public class Ex03{

	static class BankAccount {
	int minBalance;													//�����ܱ� �ʵ��Դϴ�.
	
	public BankAccount(int minBalance){								//BankAccount�� �������Դϴ�.
		this.minBalance=minBalance;
	}
	public void deposit(int money) throws InvalidWithdraw {			//�Ա� �޼ҵ� �Դϴ�.
		if(money<0) {
			throw new InvalidWithdraw("�������Դϴ�.");
		}
		else {
			this.minBalance=minBalance+money;
			System.out.println("���� �Ա� ó��: �Աݱݾ�="+money+"�ܱ�="+this.minBalance);

		}
	}
	public void withdraw(int money) throws InvalidWithdraw{			//��� �޼ҵ��Դϴ�
		if(money<0) {
			throw new InvalidWithdraw("�������Դϴ�.");
		}
		else if(this.minBalance-money<0){
			throw new InvalidWithdraw("�ܾ׺��� ����Ϸ��� ���� �����ϴ�.");	
		}
		else {
			this.minBalance=minBalance-money;
			System.out.println("���� ��� ó��: ��ݱݾ�="+money+"�ܱ�="+this.minBalance);
		}
	}
	
	class InvalidWithdraw extends Exception{						//���� �߰� �ڵ��Դϴ�.
		private static final long serialVersionUID = 1L;
		public InvalidWithdraw(String msg) {
			super(msg);
		}
	}
	public static void main(String[] args) throws InvalidWithdraw {
		BankAccount ba = new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000);
		ba.withdraw(500000);
		}
	}
}