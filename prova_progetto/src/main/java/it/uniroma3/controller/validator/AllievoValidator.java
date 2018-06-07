package it.uniroma3.controller.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.model.Allievo;

public class AllievoValidator implements Validator {

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "richiesto");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cognome", "richiesto");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "richiesto");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "richiesto");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dataNascita", "richiesto");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "luogoNascita", "richiesto");
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return Allievo.class.equals(aClass);
	}	
}
