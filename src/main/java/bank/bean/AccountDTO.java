package bank.bean;


public class AccountDTO {

	Long accNo;
	Double balance;
	Long custId;
	
	public AccountDTO(){
		accNo = null;
		balance = null;
		custId = null;
	}
	
	public AccountDTO (Long accNo, Long custId, Double balance) {
		super();
		this.accNo = accNo;
		this.custId = custId;
		this.balance = balance;
	}

	public Double getBalance() {
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
	
		
	
	
}
