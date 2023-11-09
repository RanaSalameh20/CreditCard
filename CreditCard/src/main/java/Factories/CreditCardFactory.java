
package Factories;

import com.mycompany.creditcard.ICreditCard;
import java.util.Date;


public abstract class  CreditCardFactory {
    public abstract ICreditCard createCreditCard(String cardNumber, String holderName, Date expirationDate);
}
