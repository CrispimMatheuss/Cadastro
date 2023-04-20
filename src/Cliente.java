public class Cliente extends PessoaFisica{

    private Double limiteCrediario;
    private Double limiteUtilizado;

    @Override
    public String toString() {
        return "Cliente{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }

    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
        limiteCrediario = limiteCrediario - limiteUtilizado;
    }

    public void setAumentarLimite(Double valor){
        limiteCrediario = limiteCrediario + valor;
    }

    public void setDiminuirLimite(Double valor){
        limiteCrediario = limiteCrediario - valor;

        if(limiteCrediario < 0){
            limiteCrediario = 0.0;
        }
    }

    public Cliente(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double percDesc, Double limiteCrediario, Double limiteUtilizado) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cpfPF, rgPF, sexoPF, percDesc);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Cliente(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double limiteCrediario, Double limiteUtilizado) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cpfPF, rgPF, sexoPF);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }
}
