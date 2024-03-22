package br.com.padrao.comportamental.strategy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.padrao.comportamental.strategy.models.EstrutuarPayload;
import br.com.padrao.comportamental.strategy.models.ResponseDto;
import br.com.padrao.comportamental.strategy.service.StrategyService;
import br.com.padrao.comportamental.strategy.util.Descricao;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comportamental")
public class StrategyController {
    private final StrategyService strategyService;

    @GetMapping("/strategy")
    public ResponseEntity<ResponseDto> requestMethodName(@RequestBody EstrutuarPayload param) {
        String responseMensagem = strategyService.processOrder(param);
        ResponseDto response = new ResponseDto();
        response.setMessage(responseMensagem);
        response.setDescricao(Descricao.getDescricaoStrategyString());
        response.setObjetivo(Descricao.getObjetivoStrategyString());
        return ResponseEntity.ok(response);
    }

}
