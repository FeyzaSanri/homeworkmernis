package homeworkmernis.business.concrete;

import homeworkmernis.business.abstracts.CustomerCheckService;
import homeworkmernis.entities.concrete.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService _customerCheckService;
	 
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		 this._customerCheckService = customerCheckService;
	 }
	 
  @Override
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db " + customer.getFirstName());
			
		}
		else {
			System.out.println(" Not a valid Person");
		}
	}
}
