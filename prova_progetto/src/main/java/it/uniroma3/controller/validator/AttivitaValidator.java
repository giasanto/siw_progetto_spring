package it.uniroma3.controller.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.model.Attivita;

public class AttivitaValidator implements Validator{

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "orario", "richiesto");
	}
	
	@Override
	public boolean supports(Class<?> aClass) {
		return Attivita.class.equals(aClass);
	}
}
