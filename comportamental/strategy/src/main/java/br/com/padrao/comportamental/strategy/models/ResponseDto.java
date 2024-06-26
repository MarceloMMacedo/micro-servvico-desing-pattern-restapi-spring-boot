package br.com.padrao.comportamental.strategy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private String message;
    private String descricao;
    private String objetivo;
}
