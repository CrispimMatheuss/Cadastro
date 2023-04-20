public class Funcionario extends PessoaFisica{

    private Double salarioBruto;
    private Double salarioLiquido;

    private Integer qtdDependentes;

    @Override
    public String toString() {
        return "Funcionario{" +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                ", qtdDependentes=" + qtdDependentes +
                '}';
    }

    public Funcionario(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double percDesc, Double salarioBruto, Double salarioLiquido, Integer qtdDependentes) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cpfPF, rgPF, sexoPF, percDesc);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.qtdDependentes = qtdDependentes;
    }

    public Funcionario(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double salarioBruto, Double salarioLiquido, Integer qtdDependentes) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cpfPF, rgPF, sexoPF);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.qtdDependentes = qtdDependentes;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void setDissidio(Double valor){
        salarioBruto = salarioBruto + ((salarioBruto * valor) / 100);
    }

    public Funcionario(Integer codPessoa, String nomePessoa, String endePessoa, String telePessoa, String cpfPF, String rgPF, String sexoPF, Double salarioBruto, Double salarioLiquido) {
        super(codPessoa, nomePessoa, endePessoa, telePessoa, cpfPF, rgPF, sexoPF);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Integer getQtdDependentes() {
        return qtdDependentes;
    }
}
