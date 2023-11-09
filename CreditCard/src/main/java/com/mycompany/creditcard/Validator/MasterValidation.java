
package com.mycompany.creditcard.Validator;

public class MasterValidation implements ICardValidationStrategy {

    @Override
    public boolean isValid(String cardNumber) {
        char secondDigit = cardNumber.charAt(1);
        boolean isSecondDigitValid = (secondDigit >= '1' && secondDigit <= '5');

        return cardNumber.charAt(0) == '5' && cardNumber.length() == 16 && isSecondDigitValid;
    }

}
