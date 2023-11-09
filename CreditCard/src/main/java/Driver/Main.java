package Driver;

import Factories.*;
import com.mycompany.creditcard.*;
import com.mycompany.creditcard.Validator.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "credit_card_records.txt";
        List<String> lines = CreditCardFileReader.readLinesFromFile(filePath);

        Map<ICardValidationStrategy, CreditCardFactory> initialMap = new HashMap<>();
        initialMap.put(new VisaValidation(), new VisaCardFactory());
        initialMap.put(new MasterValidation(), new MasterCardFactory());
        initialMap.put(new DiscoverValidation(), new DiscoverFactory());
        initialMap.put(new AmericanExpressValidation(), new AmericanExpressFactory());

        CreditCardProcessor processor = new CreditCardProcessor(initialMap);
        
        
        // processor.addStrategyFactory(concreteStratgy, concreteFactory);
        
        for (String line : lines) {
            String[] fields = line.split(",");
            
            String cardNumber = fields[0];
            String holderName = fields[1];
            String expirationDateStr = fields[2];
            
            boolean verifiedCardDigits = processor.VerifyCardDigits(cardNumber);
            
            if (verifiedCardDigits) {
                ICreditCard creditCard = processor.processCreditCard(cardNumber, holderName, expirationDateStr);
            }

        }
    }
}
