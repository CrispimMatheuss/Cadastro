public class Produto {
    private Integer codProduto;
    private String nomeProduto;
    private Double valorUnitario;
    private Double valorVenda;

    Fornecedor fornecedor;

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", valorVenda=" + valorVenda +
                ", fornecedor=" + fornecedor +
                '}';
    }

    public Produto(Integer codProduto, String nomeProduto, Double valorUnitario, Fornecedor fornecedor) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
        this.fornecedor = fornecedor;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorVenda() {

        valorVenda = (valorUnitario * (1 + (fornecedor.getMargemLucro()/100)));

        return valorVenda;
    }


}
