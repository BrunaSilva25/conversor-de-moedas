package com.bruna.conversordemoedas;

import java.util.Map;

public record MoedaRecebida(String result, String baseCode, Map<String, Double> conversionRates) {
}
