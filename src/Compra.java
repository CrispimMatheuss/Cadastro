import java.time.LocalDate;

public class Compra {

    private Integer codCompra;
    private LocalDate dataCompra;
    private Double qtdCompra;
    private Double valorUnitario;
    Fornecedor fornecedor;
    Produto produto;

    @Override
    public String toString() {
        return "Compra{" +
                "codCompra=" + codCompra +
                ", dataCompra=" + dataCompra +
                ", qtdCompra=" + qtdCompra +
                ", valorUnitario=" + valorUnitario +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }

    public Compra(Integer codCompra, LocalDate dataCompra, Double qtdCompra, Double valorUnitario, Fornecedor fornecedor, Produto produto) {
        this.codCompra = codCompra;
        this.dataCompra = dataCompra;
        this.qtdCompra = qtdCompra;
        this.valorUnitario = valorUnitario;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getQtdCompra() {
        return qtdCompra;
    }

    public void setQtdCompra(Double qtdCompra) {
        this.qtdCompra = qtdCompra;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
