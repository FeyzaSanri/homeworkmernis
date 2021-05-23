package homeworkmernis.adapter;

import homeworkmernis.business.abstracts.CustomerCheckService;
import homeworkmernis.entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result =  false;
		
		try {
			result= proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		}
		catch(Exception e)
		{
			System.out.println("Not a valid person");
		}
		return result;
		
	}
       
}
