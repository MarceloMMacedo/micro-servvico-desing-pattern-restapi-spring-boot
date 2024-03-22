package br.com.padrao.comportamental.strategy.models;

public class PayByCreditCard implements PayStrategy {
    private CreditCard creditCard;
    private double paymentAmount;

    public PayByCreditCard(CreditCard creditCard, double paymentAmount) {
        this.creditCard = creditCard;
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String mensagemPay() {
        String valorEmReais = String.format("R$ %.2f", paymentAmount);
        return "Pagamento via Cartão de Credito no valor de: " + valorEmReais;
    }

    @Override
    public boolean IsSignedIn() {
        if (creditCard == null)
            return false;

        return true;
    }

}
