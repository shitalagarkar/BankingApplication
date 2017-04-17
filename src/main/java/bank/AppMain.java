package bank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		repository.deleteAll();

		// save a few accounts
		/*repository.save(new Account(1001l,1001l));
		repository.save(new Account(1002l,1001l));
		repository.save(new Account(1003l,1002l));*/

		// fetch all accounts
		/*System.out.println("Account found with findAll():");
		System.out.println("-------------------------------");
		for (Account account : repository.findByCustId(1001l)) {
			System.out.println(account);
		}
		System.out.println();*/
		
		/*System.out.println("Accounts found with findAllCustAccounts(1001l):");
		System.out.println("--------------------------------");
		for (Account account : repository.findAllCustAccounts(1001l)) {
			System.out.println(account);
		}*/

	}

}
