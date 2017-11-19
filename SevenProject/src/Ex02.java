public class Ex02{

	static class BankAccount {
	int minBalance;												//최저잔금 필드입니다.
	
	public BankAccount(int minBalance){							//BankAccount의 생성자입니다.
		this.minBalance=minBalance;
	}
	public void deposit(int money) throws InvalidWithdraw {		//입금 메소드 입니다.
		if(money<0) {
			throw new InvalidWithdraw("음수값입니다.");
		}
		else {
			this.minBalance=minBalance+money;
		}
	}
	public void withdraw(int money) throws InvalidWithdraw{		//출금 메소드입니다.
		if(money<0) {
			throw new InvalidWithdraw("음수값입니다.");
		}
		else if(money>this.minBalance){
			throw new InvalidWithdraw("잔액보다 출금하려는 돈이 많습니다.");
		}
		else {
			this.minBalance=minBalance-money;
		}
	}
	
class InvalidWithdraw extends Exception{						//에러 추가 코드입니다.
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
	public static void main(String[] args) throws InvalidWithdraw {
		try {													//try문입니다.
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(500000);
		}catch(InvalidWithdraw e){								//에러예외문입니다.
			System.out.println("잔액보다 출금하려는 돈이 많습니다.");
		}
	}
}
}