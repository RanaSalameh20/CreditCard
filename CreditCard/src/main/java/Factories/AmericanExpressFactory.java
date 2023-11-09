package Factories;

import com.mycompany.creditcard.*;
import java.util.Date;


public class AmericanExpressFactory extends CreditCardFactory {

    @Override
    public ICreditCard createCreditCard(String cardNumber, String holderName, Date expirationDate) {
        return new AmericanExpressCard(cardNumber, holderName, expirationDate);
    }

}
