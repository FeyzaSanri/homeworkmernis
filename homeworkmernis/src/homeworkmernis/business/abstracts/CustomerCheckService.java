package homeworkmernis.business.abstracts;

import homeworkmernis.entities.concrete.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
