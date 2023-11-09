
package Factories;

import com.mycompany.creditcard.ICreditCard;
import com.mycompany.creditcard.MasterCard;
import java.util.Date;


public class MasterCardFactory extends CreditCardFactory {

    @Override
    public ICreditCard createCreditCard(String cardNumber, String holderName, Date expirationDate) {
        return new MasterCard(cardNumber, holderName,expirationDate);
    }

}
