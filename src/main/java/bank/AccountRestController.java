package bank;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bank.bean.AccountDTO;
import bank.reposervice.AccountRepoService;
import bank.reposervice.AccountService;
import bank.reposervice.AccountServiceImpl;

@RestController
public class AccountRestController {
	@Autowired
	private AccountRepoService repository;
	
	@RequestMapping("/")
	public List<AccountDTO> getAccounts() {
		AccountService accServ = new AccountServiceImpl();
		return accServ.getAllAcounts();
	}
	
	@RequestMapping(value="/createAccount", method = RequestMethod.GET)
	public AccountDTO createAccount (@RequestParam("accNo") Long accNo,
		@RequestParam("custId") Long custId, @RequestParam("balance") Double bal) {
		AccountService accServ = new AccountServiceImpl();
		return accServ.createAccount(new AccountDTO(accNo,custId,bal));
	}
	
	@RequestMapping(value="/readAccount", method = RequestMethod.GET)
	public void readAccount (@RequestParam("accNo") Long accNo) {
		AccountService accServ = new AccountServiceImpl();
		accServ.getAccountByNo(accNo);
	}
	
	@RequestMapping(value="/updateAccount", method = RequestMethod.GET)
	public AccountDTO updateAccount (@RequestParam("accNo") Long accNo,
			@RequestParam("balance") Double balance ) {
		AccountService accServ = new AccountServiceImpl();
		return accServ.updateAccuont(new AccountDTO(accNo,null,balance));
	}
	
	
	@RequestMapping(value="/deleteAccount", method = RequestMethod.GET)
	public void deleteAccount (@RequestParam("accNo") Long accNo) {
		AccountService accServ = new AccountServiceImpl();
		 accServ.deleteAccount(new AccountDTO(accNo,null,null));
	}
	
}
