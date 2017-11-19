public class Ex02{

	static class BankAccount {
	int minBalance;												//�����ܱ� �ʵ��Դϴ�.
	
	public BankAccount(int minBalance){							//BankAccount�� �������Դϴ�.
		this.minBalance=minBalance;
	}
	public void deposit(int money) throws InvalidWithdraw {		//�Ա� �޼ҵ� �Դϴ�.
		if(money<0) {
			throw new InvalidWithdraw("�������Դϴ�.");
		}
		else {
			this.minBalance=minBalance+money;
		}
	}
	public void withdraw(int money) throws InvalidWithdraw{		//��� �޼ҵ��Դϴ�.
		if(money<0) {
			throw new InvalidWithdraw("�������Դϴ�.");
		}
		else if(money>this.minBalance){
			throw new InvalidWithdraw("�ܾ׺��� ����Ϸ��� ���� �����ϴ�.");
		}
		else {
			this.minBalance=minBalance-money;
		}
	}
	
class InvalidWithdraw extends Exception{						//���� �߰� �ڵ��Դϴ�.
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
	public static void main(String[] args) throws InvalidWithdraw {
		try {													//try���Դϴ�.
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(500000);
		}catch(InvalidWithdraw e){								//�������ܹ��Դϴ�.
			System.out.println("�ܾ׺��� ����Ϸ��� ���� �����ϴ�.");
		}
	}
}
}