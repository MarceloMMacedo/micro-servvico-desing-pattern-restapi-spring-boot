package br.com.padrao.comportamental.strategy.models;

import lombok.Data;

@Data
public class PayByPayPal implements PayStrategy {
    private UserPay userPay;
    private double paymentAmount;

    public PayByPayPal(UserPay userPay, double paymentAmount) {
        this.userPay = userPay;

        this.paymentAmount = paymentAmount;

    }

    @Override
    public String mensagemPay() {
        // converter em string formato moeda paymentAmount
        String valorEmReais = String.format("R$ %.2f", paymentAmount);
        return "Pagamento via PayPal: " + valorEmReais;

    }

    @Override
    public boolean IsSignedIn() {
        if (userPay == null || userPay.getEmail() == null || userPay.getPassword() == null
                || userPay.getEmail().isEmpty() || userPay.getPassword().isEmpty())
            return false;

        return true;
    }
}
