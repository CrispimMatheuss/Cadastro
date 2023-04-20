public class Fornecedor extends PessoaJuridica{

    private String responsavel;
    private String observacao;
    private Double margemLucro;

    @Override
    public String toString() {
        return "Fornecedor{" +
                "responsavel='" + responsavel + '\'' +
                ", observacao='" + observacao + '\'' +
                ", margemLucro=" + margemLucro +
                '}';
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Fornecedor(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cnpjPJ, String inscPJ, String cnaePJ, String responsavel, String observacao, Double margemLucro) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cnpjPJ, inscPJ, cnaePJ);
        this.responsavel = responsavel;
        this.observacao = observacao;
        this.margemLucro = margemLucro;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
