package br.com.padrao.comportamental.strategy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPay implements IdentifyPay {
    private String email;
    private String password;
}
