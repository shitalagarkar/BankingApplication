package bank.reposervice;

import java.util.List;

import bank.bean.AccountDTO;

public interface AccountService {

	public AccountDTO createAccount (AccountDTO accDTO);
	
	public AccountDTO updateAccuont (AccountDTO accDTO);
	
	public void deleteAccount (AccountDTO accDTO);
	
	public List<AccountDTO> getAllAcounts ();
	
	public AccountDTO getAccountByNo (Long accNumber) ;
}
