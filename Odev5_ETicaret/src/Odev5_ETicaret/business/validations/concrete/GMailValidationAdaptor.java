package Odev5_ETicaret.business.validations.concrete;

import Odev5_ETicaret.business.validations.abstracts.MailValidation;
import Odev5_ETicaret.gmailValidator.GMailValidatorManager;

public class GMailValidationAdaptor implements MailValidation {

	@Override
	public boolean checkEMail(String eMail) {
		GMailValidatorManager gmailValidatorManager= new GMailValidatorManager();
		
		boolean response=gmailValidatorManager.checkGMail(eMail);
		if (response==true) {
			return true;
		}
		return false;
	}

}
