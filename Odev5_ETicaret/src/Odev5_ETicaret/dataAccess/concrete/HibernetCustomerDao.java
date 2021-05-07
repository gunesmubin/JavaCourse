package Odev5_ETicaret.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import Odev5_ETicaret.dataAccess.abstracts.CustomerDao;
import Odev5_ETicaret.entities.concretes.Customer;

public class HibernetCustomerDao implements CustomerDao {

	List<Customer> customers =new ArrayList<Customer>();
	
	@Override
	public boolean add(Customer customer) {
		customers.add(customer);
		return true;
	}

	@Override
	public boolean login(String eMail, String password) {

		for (Customer customer : customers) {
	    	if (customer.geteMail()==eMail && customer.getPassword()==password ) {
	    		return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkEmail(String eMail) {
		// TODO Auto-generated method stub
	    for (Customer customer : customers) {
	    	if (customer.geteMail()==eMail) {
	    		return false;
			}
		}
		return true;
	}


}
