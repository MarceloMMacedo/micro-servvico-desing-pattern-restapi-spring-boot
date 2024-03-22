package br.com.padrao.comportamental.strategy.models;

import lombok.Data;

@Data
public class CreditCard implements IdentifyPay {
    private int amount;
    private String number;
    private String date;
    private String cvv;
}
