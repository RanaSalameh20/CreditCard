package Driver;

import Factories.*;
import com.mycompany.creditcard.*;
import com.mycompany.creditcard.Validator.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;


public class CreditCardProcessor {

    private Map<ICardValidationStrategy, CreditCardFactory> strategyFactoryMap;

    public CreditCardProcessor(Map<ICardValidationStrategy, CreditCardFactory> initialMap) {
        this.strategyFactoryMap = new HashMap<>(initialMap);
    }

    public ICreditCard processCreditCard(String cardNumber, String holderName, String expirationDateStr) {

        ValidationContext validationContext = new ValidationContext();

        for (Entry<ICardValidationStrategy, CreditCardFactory> entry : strategyFactoryMap.entrySet()) {
            ICardValidationStrategy strategy = entry.getKey();
            validationContext.setValidationStratgy(strategy);

            if (validationContext.checkValidation(cardNumber)) {
                CreditCardFactory factory = entry.getValue();
                ICreditCard creditCard = factory.createCreditCard(
                        cardNumber, holderName, parseExpirationDate(expirationDateStr)
                );
                System.out.println("the holder name " + creditCard.getHolderName() + " and here's the card number: " + creditCard.getCardNumber());
                return creditCard;
            }
        }
        System.out.println("Wrong card number!!");
        return null;

    }

    public boolean VerifyCardDigits(String cardNumber) {
        if (cardNumber.length() > 19) {
            System.out.println("Invalid card number: " + cardNumber);
            return false;
        }
        return true;
    }

    public void addStrategyFactory(ICardValidationStrategy strategy, CreditCardFactory factory) {
        strategyFactoryMap.put(strategy, factory);
    }

    private static Date parseExpirationDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy, MM, dd");
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid expiration date format: " + dateStr);
            return null;
        }
    }
}









