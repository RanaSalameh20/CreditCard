
package com.mycompany.creditcard.Validator;


public class ValidationContext {
    private ICardValidationStrategy stratgy;
    
    public void setValidationStratgy(ICardValidationStrategy stratgy){
         this.stratgy = stratgy;
    }
 
    public boolean checkValidation(String cardNumber){
        return stratgy.isValid(cardNumber);
    }
}
