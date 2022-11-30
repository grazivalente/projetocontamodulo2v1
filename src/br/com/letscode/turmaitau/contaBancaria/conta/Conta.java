package br.com.letscode.turmaitau.contaBancaria.conta;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;
    private Cliente cliente;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Conta(String numero) {
        this.numero = numero;
    }

    public Conta(String numero, Cliente cliente) {
        this(numero);
        this.cliente = cliente;
    }

    protected void AdicionarSaldo(BigDecimal valorDepositado) {
    }

    public void SacarConta(BigDecimal valor) {
    }

    public void DepositarConta(BigDecimal valor) throws ValidacaoContaBancariaException {
        BigDecimal valorDepositado = 
                valor.multiply(0.01)).add(valor);
    super.AdicionarSaldo(valorDepositado);
    }

    public void transferir(ContaCorrente contaCorrente, BigDecimal valor) {
    }

    public Cliente getCliente() {
    }

    public BigDecimal getSaldo() {
        return null;
    }
}
