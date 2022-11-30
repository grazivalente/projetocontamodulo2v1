package br.com.letscode.turmaitau.contaBancaria.cliente;

public class ClientePessoaJuridica extends Cliente {

    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        setNome(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientePessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
