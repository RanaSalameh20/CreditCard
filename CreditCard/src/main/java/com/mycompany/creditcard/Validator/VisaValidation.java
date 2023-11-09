package com.mycompany.creditcard.Validator;


public class VisaValidation implements ICardValidationStrategy{

    @Override
    public boolean isValid(String cardNumber) {
         return cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16);
    }
    
}
