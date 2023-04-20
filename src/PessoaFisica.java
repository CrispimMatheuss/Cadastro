public class PessoaFisica extends Pessoa{

    private String cpfPF;
    private String rgPF;
    private String sexoPF;
    private Double percDesc;

    public Double getPercDesc() {
        return percDesc;
    }

    public void setPercDesc(Double percDesc) {
        this.percDesc = percDesc;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpfPF='" + cpfPF + '\'' +
                ", rgPF='" + rgPF + '\'' +
                ", sexoPF='" + sexoPF + '\'' +
                ", percDesc=" + percDesc +
                '}';
    }

    public String getCpfCli() {
        return cpfPF;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfPF = cpfCli;
    }

    public String getRgCli() {
        return rgPF;
    }

    public void setRgCli(String rgCli) {
        this.rgPF = rgCli;
    }

    public String getSexoCli() {
        return sexoPF;
    }

    public void setSexoCli(String sexoCli) {
        this.sexoPF = sexoCli;
    }

    public PessoaFisica(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double percDesc) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa);
        this.cpfPF = cpfPF;
        this.rgPF = rgPF;
        this.sexoPF = sexoPF;
        this.percDesc = percDesc;
    }

    public PessoaFisica(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa);
        this.cpfPF = cpfPF;
        this.rgPF = rgPF;
        this.sexoPF = sexoPF;
    }

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpfCli();
    }
}
