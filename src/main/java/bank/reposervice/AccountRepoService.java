package bank.reposervice;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;

import bank.bean.Account;
@ComponentScan
public interface AccountRepoService extends MongoRepository<Account, Long> {
	public List<Account>	findByCustId (Long custId);
	public Account	findByAccNo (Long accNo);
//	public Double	getBalance (Long accId);
}
