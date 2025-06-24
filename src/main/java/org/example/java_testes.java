package org.example;

import java.util.ArrayList;
import java.util.List;

public class java_testes {

    public static List<String> gerarAnagramas(char[] letras) {
        if (letras == null || letras.length == 0) {
            throw new IllegalArgumentException("Input não pode ser vazio.");
        }

        for (char c : letras) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Input deve conter apenas letras.");
            }
        }

        List<String> resultado = new ArrayList<>();
        boolean[] usados = new boolean[letras.length];
        StringBuilder atual = new StringBuilder();

        backtrack(letras, usados, atual, resultado);

        return resultado;
    }

    private static void backtrack(char[] letras, boolean[] usados, StringBuilder atual, List<String> resultado) {
        if (atual.length() == letras.length) {
            resultado.add(atual.toString());
            return;
        }

        for (int i = 0; i < letras.length; i++) {
            if (usados[i]) continue;

            usados[i] = true;
            atual.append(letras[i]);

            backtrack(letras, usados, atual, resultado);

            atual.deleteCharAt(atual.length() - 1);
            usados[i] = false;
        }
    }

    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c'};
        List<String> anagramas = gerarAnagramas(letras);
        System.out.println("Anagramas:");
        for (String a : anagramas) {
            System.out.println(a);
        }
    }
}