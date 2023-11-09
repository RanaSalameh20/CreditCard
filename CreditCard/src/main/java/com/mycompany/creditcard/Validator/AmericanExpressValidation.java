
package com.mycompany.creditcard.Validator;


public class AmericanExpressValidation implements ICardValidationStrategy{

    @Override
    public boolean isValid(String cardNumber) {
        return cardNumber.startsWith("34") || cardNumber.startsWith("37") && cardNumber.length() == 15;
    }
    
}
