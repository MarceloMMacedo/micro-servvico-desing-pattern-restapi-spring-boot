package br.com.padrao.comportamental.strategy.util;

public class Descricao {
    public static String getObjetivoStrategyString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "Ele permite encapsular diferentes estratégias em classes separadas e escolher a estratégia");
        sb.append(
                " adequada em tempo de execução. Isso é especialmente útil em situações em que você precisa alternar dinamicamente entre diferentes");
        sb.append(
                " comportamentos em tempo de execução. Por exemplo, no cálculo de custos de envio com base em diferentes provedores de envio.");
        return sb.toString();
    }

    public static String getDescricaoStrategyString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "Strategy e um padrao de projeto comportamental que transforma um conjunto de comportamentos em objetos e os torna intercambiáveis dentro do objeto de contexto original.");
        sb.append("\r\n");
        return sb.toString();
    }

}
