public class PessoaJuridica extends Pessoa{

    private String cnpjPJ;
    private String inscPJ;
    private String cnaePJ;

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpjPJ='" + cnpjPJ + '\'' +
                ", inscPJ='" + inscPJ + '\'' +
                ", cnaePJ='" + cnaePJ + '\'' +
                '}';
    }

    public String getCnpjPJ() {
        return cnpjPJ;
    }

    public void setCnpjPJ(String cnpjPJ) {
        this.cnpjPJ = cnpjPJ;
    }

    public String getInscPJ() {
        return inscPJ;
    }

    public void setInscPJ(String inscPJ) {
        this.inscPJ = inscPJ;
    }

    public String getCnaePJ() {
        return cnaePJ;
    }

    public void setCnaePJ(String cnaePJ) {
        this.cnaePJ = cnaePJ;
    }

    public PessoaJuridica(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cnpjPJ, String inscPJ, String cnaePJ) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa);
        this.cnpjPJ = cnpjPJ;
        this.inscPJ = inscPJ;
        this.cnaePJ = cnaePJ;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCnpjPJ();
    }
}
