public class Pessoa {
    private Integer codPessoa;
    private String nomePessoa;
    private String endePessoa;
    private String telePessoa;

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getEndePessoa() {
        return endePessoa;
    }

    public String getTelePessoa() {
        return telePessoa;
    }

    public void setCodPessoa(Integer codPessoa) {
        this.codPessoa = codPessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setEndePessoa(String endePessoa) {
        this.endePessoa = endePessoa;
    }

    public void setTelePessoa(String telePessoa) {
        this.telePessoa = telePessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codPessoa=" + codPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", endePessoa='" + endePessoa + '\'' +
                ", telePessoa='" + telePessoa + '\'' +
                '}';
    }

    public Pessoa(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa) {
        this.codPessoa = codPessoa;
        this.nomePessoa = nomePessoa;
        this.endePessoa = endePessoa;
        this.telePessoa = telePessoa;
    }

    public String getDocumentoPrincipal(){
        return "";
    }
}
