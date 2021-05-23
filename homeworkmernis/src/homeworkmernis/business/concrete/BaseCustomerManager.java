package homeworkmernis.business.concrete;


import homeworkmernis.business.abstracts.CustomerService;
import homeworkmernis.entities.concrete.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db" + customer.getFirstName());
		
	}

}
