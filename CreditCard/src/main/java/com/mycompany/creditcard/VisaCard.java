
package com.mycompany.creditcard;

import java.util.Date;


public class VisaCard implements ICreditCard {

    private String cardNumber;
    private String holderName;
    private Date expirationDate;

    public VisaCard() {

    }

    public VisaCard(String cardNumber, String holderName, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public String getCardNumber() {
        return this.cardNumber;
    }

}
