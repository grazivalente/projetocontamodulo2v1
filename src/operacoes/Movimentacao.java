package operacoes;

import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public class Movimentacao extends ContaMain {
    @Override
    public void DepositarConta () throws ValidacaoContaBancariaException {
        DepositarConta(null);
    }

    @Override
    public void DepositarConta (BigDecimal valor) throws ValidacaoContaBancariaException {

    }
}
