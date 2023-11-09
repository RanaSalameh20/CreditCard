
package com.mycompany.creditcard.Validator;


public class DiscoverValidation implements ICardValidationStrategy {

    @Override
    public boolean isValid(String cardNumber) {
        return cardNumber.startsWith("6011") && cardNumber.length() == 16;
    }

}
