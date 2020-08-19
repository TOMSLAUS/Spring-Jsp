package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeConstraintValidator implements ConstraintValidator<Code, String>{

	
	private String prefix;
	
	@Override
	public void initialize(Code code) {
		prefix=code.value();
	}
	
	@Override
	public boolean isValid(String passedCode, ConstraintValidatorContext arg1) {
			
		if(passedCode != null) {
		return passedCode.startsWith(prefix);
	}
		else return true;
	}
	
}

