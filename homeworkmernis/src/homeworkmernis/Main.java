package homeworkmernis;

import java.time.LocalDate;

import homeworkmernis.adapter.MerniceServiceAdapter;
import homeworkmernis.business.concrete.BaseCustomerManager;
import homeworkmernis.business.concrete.NeroCustomerManager;
import homeworkmernis.business.concrete.StarbucksCustomerManager;
import homeworkmernis.entities.concrete.Customer;

public class Main {

	public static void main(String[] args) {
        
		Customer customer =new Customer(4, "Feyza Nur", "Sanrý", LocalDate.of(1999,1,4),"98765432198");
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MerniceServiceAdapter());
		customerManager.save(customer);	
		
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager1.save(customer);	
		
		
		
       
		
	}

}
