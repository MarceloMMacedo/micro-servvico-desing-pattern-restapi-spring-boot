package br.com.padrao.comportamental.strategy.models;

import lombok.Data;

@Data
public class Order {
    private double totalCost = 0;
    private boolean isClosed = false;

    public String processOrder(PayStrategy strategy) {
        return strategy.mensagemPay();
    }

    public void setTotalCost(double totalCost) {
        this.totalCost += totalCost;
    }
}
