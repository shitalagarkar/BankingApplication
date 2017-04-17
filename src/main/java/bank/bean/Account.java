package bank.bean;

import org.springframework.data.annotation.Id;

public class Account {
	@Id
	Long accNo;
	Double balance;
	Long custId;
	
	private Account(Long accNo, Long custId, Double bal) {
		super();
		this.accNo = accNo;
		this.custId = custId;
		this.balance = bal;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public Long getAccNo() {
		return accNo;
	}

/*	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
*/
	public Long getCustId() {
		return custId;
	}

/*	public void setCustId(Long custId) {
		this.custId = custId;
	}
*/
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", custId=" + custId + "]";
	}
	
	public static class AccountBuilder {
		private Long accountNo;
		private Long custId;
		private Double balance;
		
		public AccountBuilder (final AccountDTO accDTO) {
			accountNo = accDTO.getAccNo();
			custId = accDTO.getCustId();
			balance = accDTO.getBalance();
		}
		
		public AccountBuilder (final Long accountNumber, final Long customerId, final Double accBalance) {
			accountNo = accountNumber;
			custId = customerId;
			balance = accBalance;
		}
		
		public Account createAccount () {
			return new Account (accountNo,custId,balance) ;
		}

	}
}
