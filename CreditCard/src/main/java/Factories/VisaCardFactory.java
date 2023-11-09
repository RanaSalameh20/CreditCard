package Factories;

import com.mycompany.creditcard.ICreditCard;
import com.mycompany.creditcard.VisaCard;
import java.util.Date;


public class VisaCardFactory extends CreditCardFactory {

    @Override
    public ICreditCard createCreditCard(String cardNumber, String holderName, Date expirationDate) {
        return new VisaCard(cardNumber, holderName ,expirationDate);
    }

}
