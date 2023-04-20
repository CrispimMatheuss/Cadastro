import java.time.LocalDate;

public class PedidoVenda {
    private Integer codVenda;
    private Boolean ehFuncionario;
    private LocalDate dataVenda;
    private Double qtdProduto;
    private Double valorUnitario;
    private Double valorTotalVenda;

    private Double percDescCli;

    Produto produto;

    Cliente cliente;

    @Override
    public String toString() {
        return "PedidoVenda{" +
                "codVenda=" + codVenda +
                ", ehFuncionario=" + ehFuncionario +
                ", dataVenda=" + dataVenda +
                ", qtdProduto=" + qtdProduto +
                ", valorUnitario=" + valorUnitario +
                ", valorTotalVenda=" + valorTotalVenda +
                ", produto=" + produto +
                ", cliente=" + cliente +
                '}';
    }

    public PedidoVenda(Integer codVenda, Boolean ehFuncionario, LocalDate dataVenda, Double qtdProduto, Double valorUnitario, Produto produto, Cliente cliente) {
        this.codVenda = codVenda;
        this.ehFuncionario = ehFuncionario;
        this.dataVenda = dataVenda;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.produto = produto;
        this.cliente = cliente;
    }

    public Double getValorTotalVenda() {
        percDescCli = 1 - (cliente.getPercDesc()/100);
        valorTotalVenda = ((valorUnitario * qtdProduto) * percDescCli);

        return valorTotalVenda;
    }
}
