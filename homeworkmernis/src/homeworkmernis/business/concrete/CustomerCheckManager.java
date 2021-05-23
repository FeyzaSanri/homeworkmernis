package homeworkmernis.business.concrete;

import homeworkmernis.business.abstracts.CustomerCheckService;
import homeworkmernis.entities.concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
}
