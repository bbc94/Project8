public class Ex03{

	static class BankAccount {
	int minBalance;													//최저잔금 필드입니다.
	
	public BankAccount(int minBalance){								//BankAccount의 생성자입니다.
		this.minBalance=minBalance;
	}
	public void deposit(int money) throws InvalidWithdraw {			//입금 메소드 입니다.
		if(money<0) {
			throw new InvalidWithdraw("음수값입니다.");
		}
		else {
			this.minBalance=minBalance+money;
			System.out.println("정상 입금 처리: 입금금액="+money+"잔금="+this.minBalance);

		}
	}
	public void withdraw(int money) throws InvalidWithdraw{			//출금 메소드입니다
		if(money<0) {
			throw new InvalidWithdraw("음수값입니다.");
		}
		else if(this.minBalance-money<0){
			throw new InvalidWithdraw("잔액보다 출금하려는 돈이 많습니다.");	
		}
		else {
			this.minBalance=minBalance-money;
			System.out.println("정상 출금 처리: 출금금액="+money+"잔금="+this.minBalance);
		}
	}
	
	class InvalidWithdraw extends Exception{						//에러 추가 코드입니다.
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