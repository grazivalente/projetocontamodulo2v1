package operacoes;

import Exceptions.ValidarExcecao;

import java.math.BigDecimal;

public class AdicionarSaldo extends ContaMain {

    protected AdicionarSaldo(BigDecimal valor) throws ValidarExcecao {
        super();
        this.validarValorNullOuNegativo(valor);
        this.saldo = saldo.add(valor);
    }

    @Override
    public void DepositarConta (BigDecimal valor) throws ValidarExcecao{
    super();
    this.validarValorNullOuNegativo();
    this.saldo = getSaldo();

    }

    @Override
    public void DepositarConta() throws  ValidarExcecao {
        DepositarConta(null);
    }


    @Override
    public void DepositarConta(BigDecimal valor) throws  ValidarExcecao {

    }
}
