package com.example.demo.validators;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import org.springframework.stereotype.Component;

@Component("digitValidator")
public class DigitValidator implements Validator<Integer> {

  @Override
  public void validate(FacesContext context, UIComponent component, Integer value) throws ValidatorException {
    if (value != null && (value < 0 || value > 9)) {
      throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation fail", null));
    }
  }

}
