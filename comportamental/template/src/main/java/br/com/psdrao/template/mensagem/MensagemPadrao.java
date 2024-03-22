package br.com.psdrao.template.mensagem;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class MensagemPadrao {
        private String mensagem;
        private String objetivo;
        private Map<String, String> situacao = new HashMap<>();
        private Map<String, String> observacoes = new HashMap<>();

        public static MensagemPadrao MensagemPadraoImp() {
                StringBuilder sb = new StringBuilder();
                MensagemPadrao mensagemPadrao = new MensagemPadrao();
                sb.append("O padrão Template Method é um padrão comportamental que define a estrutura de um algoritmo em uma classe base, permitindo que as subclasses implementem ou substituam partes específicas desse algoritmo sem alterar sua estrutura geral. O padrão é baseado no princípio do \"hook\" (gancho), onde a classe base define os passos básicos do algoritmo, mas permite que as subclasses personalizem ou forneçam implementações específicas para certos passos.");
                sb.append(" são notificados automaticamente e atualizados de acordo com a mudança");
                mensagemPadrao.setMensagem(sb.toString());
                sb = new StringBuilder();

                sb.append("O objetivo do padrão Template Method é fornecer uma estrutura flexível para a definição de algoritmos, permitindo que partes específicas do algoritmo sejam personalizadas ou sobrescritas sem alterar a estrutura global. Isso promove a reutilização de código, uma vez que o esqueleto do algoritmo é definido na classe base e as subclasses podem fornecer implementações específicas para os detalhes variáveis.");
                mensagemPadrao.setObjetivo(sb.toString());

                mensagemPadrao.getSituacao().put("description",
                                "O padrão Template Method também ajuda a evitar a duplicação de código, permitindo que as subclasses compartilhem o mesmo código comum definido na classe base. Ele promove a separação de responsabilidades, onde a classe base se concentra na estrutura geral do algoritmo e as subclasses se concentram nos detalhes específicos.");
                mensagemPadrao.getSituacao().put("summary",
                                "Em resumo, o padrão Template Method é útil quando você tem um algoritmo com uma estrutura fixa, mas com partes variáveis que precisam ser personalizadas. Ele fornece um esqueleto reutilizável para o algoritmo, permitindo que as subclasses forneçam suas próprias implementações para os detalhes específicos. Isso resulta em um código mais flexível, modular e de fácil manutenção.");
                return mensagemPadrao;

        }
}
