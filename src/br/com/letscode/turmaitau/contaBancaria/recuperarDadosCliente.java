package br.com.letscode.turmaitau.contaBancaria;

import br.com.letscode.turmaitau.contaBancaria.validacoes.EntradaTipoPessoaException;
import jdk.internal.org.objectweb.asm.tree.InsnList;

public interface recuperarDadosCliente {

    final class Cliente extends Throwable {
        void recuperarDadosCliente()
                throws EntradaTipoPessoaException {


        System.out.print("\nTipo cliente (F/J): ");
        InsnList.InsnListIterator entrada = null;
        String tipoPessoa = (String) entrada.next();

        if (tipoPessoa.equalsIgnoreCase("F")) {
            try {
                throw  recuperarDadosPessoaFisica();
            } catch (Cliente e) {
                throw new RuntimeException(e);
            }
        } else if (tipoPessoa.equalsIgnoreCase("J")) {
            Cliente pessoaJuridica = recuperarDadosPessoaJuridica();
            Cliente pessoaJuridica1 = pessoaJuridica;
            Cliente juridica = pessoaJuridica;

            try {
                throw new EntradaTipoPessoaException("Opcao tipo cliente invalida");
            } catch (EntradaTipoPessoaException e) {
                throw new RuntimeException(e);
            }
        } catch Object EntradaTipoPessoaException;
            Object entradaTipoPessoaException = EntradaTipoPessoaException;
            throw new EntradaTipoPessoaException();
        }

    }

    static Cliente recuperarDadosPessoaJuridica() {
        return null;
    }

    static Cliente recuperarDadosPessoaFisica() {
        return null;
    }
}
