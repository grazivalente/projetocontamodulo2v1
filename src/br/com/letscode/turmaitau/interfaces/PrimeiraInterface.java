package br.com.letscode.turmaitau.interfaces;

import br.com.letscode.turmaitau.contaBancaria.conta.Conta;

import java.io.Serializable;

public interface PrimeiraInterface extends Serializable, Comparable {

    final static String nome = "";

    void teste();

    default String imprimirOla() {
        return "Ola, mundo!";
    }

}
