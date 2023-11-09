
package com.mycompany.creditcard;

import java.util.Date;

public class AmericanExpressCard implements ICreditCard {

    private String cardNumber;
    private String holderName;
    private Date expirationDate;

    public AmericanExpressCard(String cardNumber, String holderName, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

}
