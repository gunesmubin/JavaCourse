package Odev5_ETicaret.business.concrete;

import Odev5_ETicaret.business.abstracts.CustomerService;
import Odev5_ETicaret.business.utils.VerificationMail;
import Odev5_ETicaret.business.validations.concrete.ValidationManager;
import Odev5_ETicaret.dataAccess.abstracts.CustomerDao;
import Odev5_ETicaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService  {

	private CustomerDao customerDao;
	private ValidationManager validationManager;
	
	public CustomerManager(CustomerDao customerDao,ValidationManager validationManager) {
		this.customerDao = customerDao;
		this.validationManager = validationManager;
	}

	@Override
	public String add(Customer customer) {
		String message;
		boolean checkUser;
		boolean addUser;
		boolean checkEmail;
		boolean isValidEmail;
		checkUser=validationManager.customerIsValid(customer);
		if (checkUser==true) {
			isValidEmail=validationManager.checkEMail(customer.geteMail());
			if (isValidEmail==false) {
				message="Uygun Mail adresi Giriniz.";
				return message;
			}
			checkEmail=customerDao.checkEmail(customer.geteMail());
			if (checkEmail==false) {
				message="E Mail Adresi Daha �nceden Kay�t Olunmu�";
				return message;
			}
			addUser=customerDao.add(customer);
			if (addUser==true) {
				message="Kullan�c� Ba�ar� ile Eklendi";
				String sendMail =VerificationMail.sendMail(customer.geteMail());
				return message +" ve " + sendMail ;
				
			}
			else
			{
				message="Hata Olu�tu";
				return message;
			}
			
		}
		else
		{
			message="Kullan�c� Bilgilerini Kontrol Ediniz.";
			return message;
		}

		
	}

	@Override
	public String login(String eMail, String password) {
		String message;
		boolean login;
		login=customerDao.login(eMail,password);
		if (login==true) {
			
			message="Giri� Ba�ar�l�";
			return message;
		}
		else {
			message="Giri� Bilgilerinizi Kontrol Ediniz.";
			return message;
		}
		
	}





	

}
