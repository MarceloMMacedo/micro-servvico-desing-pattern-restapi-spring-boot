package br.com.padrao.comportamental.strategy.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.padrao.comportamental.strategy.models.CreditCard;
import br.com.padrao.comportamental.strategy.models.EstrutuarPayload;
import br.com.padrao.comportamental.strategy.models.PayByCreditCard;
import br.com.padrao.comportamental.strategy.models.PayByPayPal;
import br.com.padrao.comportamental.strategy.models.PayStrategy;
import br.com.padrao.comportamental.strategy.models.UserPay;

@Service
public class StrategyService {
    public String processOrder(EstrutuarPayload payload) {
        PayStrategy strategy = null;
        if (payload.getMetodo() == 0) {
            UserPay userPay = new UserPay();
            BeanUtils.copyProperties(payload, userPay);
            strategy = new PayByPayPal(userPay, payload.getValor());

        } else if (payload.getMetodo() == 1) {
            CreditCard creditCard = new CreditCard();
            BeanUtils.copyProperties(payload, creditCard);
            strategy = new PayByCreditCard(creditCard, payload.getValor());
        }
        if (strategy == null) {
            return "Metodo de pagamento invalido";
        }
        return strategy.mensagemPay();
    }
}