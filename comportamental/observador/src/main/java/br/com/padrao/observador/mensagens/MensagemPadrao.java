package br.com.padrao.observador.mensagens;

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
                sb.append("O padrão Observer é um padrão comportamental que permite a comunicação entre objetos");
                sb.append(
                                " de forma desacoplada. Ele define uma relação de um-para-muitos entre objetos, onde um");
                sb.append(
                                " objeto principal, chamado de objeto observável ou sujeito, mantém uma lista de objetos");
                sb.append(
                                " secundários, chamados de observadores. Quando ocorre uma alteração no objeto observável, todos os observadores");
                sb.append(" são notificados automaticamente e atualizados de acordo com a mudança");
                mensagemPadrao.setMensagem(sb.toString());
                sb = new StringBuilder();

                sb.append(
                                "O objetivo do padrão Observer é fornecer uma maneira flexível de atualizar vários objetos automaticamente quando um objeto observável sofre alterações. Ele permite que os objetos observadores sejam notificados e atualizados de forma desacoplada e dinâmica, eliminando a necessidade de acoplamento direto entre o objeto observável e os observadores. Isso promove a reutilização de código, modularidade e extensibilidade, pois novos observadores podem ser adicionados facilmente sem modificar o objeto observável.");
                mensagemPadrao.setObjetivo(sb.toString());

                mensagemPadrao.getSituacao().put("Notificações",
                                "Quando você precisa enviar notificações para diferentes canais, como email, SMS, push notification, etc. O objeto observável seria responsável por detectar eventos e o observador seria responsável por processar as notificações de acordo com o canal específico.");

                mensagemPadrao.getSituacao().put("Eventos em interfaces gráficas",
                                "Ao lidar com interfaces gráficas, o padrão Observer é amplamente utilizado para atualizar automaticamente os componentes visuais quando ocorrem alterações em um objeto de dados subjacente. Por exemplo, atualizar uma tabela de dados quando uma nova entrada é adicionada.");

                mensagemPadrao.getSituacao().put("Integração de sistemas",
                                "Em sistemas distribuídos, o padrão Observer é útil para manter a sincronização e notificação de eventos entre diferentes partes do sistema. Por exemplo, quando uma entidade é atualizada em um banco de dados central, os sistemas periféricos podem ser notificados automaticamente.");
                return mensagemPadrao;

        }
}
