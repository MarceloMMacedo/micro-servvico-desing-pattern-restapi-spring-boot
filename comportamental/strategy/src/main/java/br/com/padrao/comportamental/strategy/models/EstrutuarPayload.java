package br.com.padrao.comportamental.strategy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstrutuarPayload {
    private int metodo = 0;
    private double valor = 0;
    private double totalCost = 0;
    private boolean isClosed = false;
    private int amount;
    private String number;
    private String date;
    private String cvv;

}
