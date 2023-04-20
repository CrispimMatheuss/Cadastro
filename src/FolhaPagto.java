import java.time.LocalDate;

public class FolhaPagto {

    private Integer codFolha;
    private LocalDate dataPagto;
    private Double salarioLiquido;

    Funcionario funcionario;

    @Override
    public String toString() {
        return "FolhaPagto{" +
                "codFolha=" + codFolha +
                ", dataPagto=" + dataPagto +
                ", salarioLiquido=" + salarioLiquido +
                ", funcionario=" + funcionario +
                '}';
    }

    public FolhaPagto(Integer codFolha, LocalDate dataPagto, Funcionario funcionario) {
        this.codFolha = codFolha;
        this.dataPagto = dataPagto;
        this.funcionario = funcionario;
    }

    public Double getSalario(){
        Double salarioBruto;
        Double percDescInss;
        Double totalDescInss;
        Double percDescIRPF;
        Double totalDescIRPF;
        Double descDependentes;
        Integer qtdDependentes;

        salarioBruto = funcionario.getSalarioBruto();
        qtdDependentes = funcionario.getQtdDependentes();
        percDescIRPF = 0.0;
        percDescInss = 0.0;
        descDependentes = 0.0;

        if (salarioBruto <= 1302.0){
            percDescInss = (7.5/100);
        }
        if (salarioBruto > 1302.0 && salarioBruto <= 2571.29){
            percDescInss = (9.0/100);
        }
        if (salarioBruto > 2571.29 && salarioBruto <= 3856.94){
            percDescInss = (12.0/100);
        }
        if (salarioBruto > 3856.94){
            percDescInss = (14.0/100);
        }

        if (salarioBruto <= 1903.98){
            percDescIRPF = 0.0;
        }
        if (salarioBruto > 1903.98 && salarioBruto <= 2826.65){
            percDescIRPF = (7.5/100);
        }
        if (salarioBruto > 2826.65 && salarioBruto <= 3751.05){
            percDescIRPF = (15.0/100);
        }
        if (salarioBruto > 3751.06 && salarioBruto <= 4664.68){
            percDescIRPF = (22.5/100);
        }
        if (salarioBruto > 4664.68){
            percDescIRPF = (27.5/100);
        }

        if (qtdDependentes > 0){
            descDependentes = qtdDependentes * 189.59;
        }

        totalDescInss = (salarioBruto * percDescInss);
        totalDescIRPF = (salarioBruto * percDescIRPF);

        salarioLiquido = salarioBruto - (totalDescInss + totalDescIRPF + descDependentes);

        return salarioLiquido;
    }
}
