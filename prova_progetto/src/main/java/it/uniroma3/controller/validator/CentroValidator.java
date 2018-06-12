package it.uniroma3.controller.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.model.Centro;

public class CentroValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Centro.class.equals(aClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "indirizzo", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "capienzaMax", "richiesto");
	}
}