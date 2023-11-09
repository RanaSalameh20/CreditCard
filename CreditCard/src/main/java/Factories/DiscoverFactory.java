package Factories;

import com.mycompany.creditcard.*;
import java.util.Date;

public class DiscoverFactory extends CreditCardFactory {

    @Override
    public ICreditCard createCreditCard(String cardNumber, String holderName, Date expirationDate) {
        return new DiscoverCard(cardNumber,holderName, expirationDate );
    }

}
