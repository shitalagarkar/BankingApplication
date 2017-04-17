package bank.reposervice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bank.bean.Account;
import bank.bean.AccountDTO;

@Component
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepoService repository;

	@Override
	public AccountDTO createAccount(AccountDTO accDTO) {

		repository.save((new Account.AccountBuilder(accDTO.getAccNo(), accDTO.getCustId(), accDTO.getBalance()))
				.createAccount());
		return accDTO;
	}

	@Override
	public AccountDTO updateAccuont(AccountDTO accDTO) {
		
		Account originalAcc = repository.findByAccNo(accDTO.getAccNo());
		originalAcc.setBalance(accDTO.getBalance());
		repository.save(originalAcc);
		
		return new AccountDTO(originalAcc.getAccNo(),originalAcc.getCustId(),originalAcc.getBalance());
	}

	@Override
	public void deleteAccount(AccountDTO accDTO) {
		repository.delete(new Account.AccountBuilder(accDTO.getAccNo(),accDTO.getCustId(),accDTO.getBalance()).createAccount());

	}

	@Override
	public List<AccountDTO> getAllAcounts() {
		List<AccountDTO> dtoList = new ArrayList<AccountDTO>();
		List<Account> accountList = repository.findAll();
		for(Account acc : accountList) {
			dtoList.add(new AccountDTO(acc.getAccNo(),acc.getCustId(),acc.getBalance()) );
		}
		
		return dtoList;
	}

	@Override
	public AccountDTO getAccountByNo(Long accNumber) {
		Account originalAcc = repository.findByAccNo(accNumber);
		return new AccountDTO (originalAcc.getAccNo(),originalAcc.getCustId(),originalAcc.getBalance() );
		
	}

}
