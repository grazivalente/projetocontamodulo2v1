package operacoes;

import Exceptions.ValidarExcecao;
import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public abstract class DepositarConta extends ContaMain {


    public DepositarConta(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void DepositarConta() throws ValidarExcecao {
        DepositarConta(null);
    }

    @Override
    public void DepositarConta(BigDecimal valor) throws ValidarExcecao {

    }

    public abstract void DepositarConta(BigDecimal valor) throws ValidarExcecao;
}
