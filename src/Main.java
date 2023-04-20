import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Matheus Crispim Santiago", "Criciuma", "999408047", "060.594.459-85", "4809454", "Masculino", 6.0,10000.0, 0.0);
        Funcionario funcionario = new Funcionario(2, "Marilia Studzinski", "Criciúma", "996426449", "098.453.699-01", "88888", "Feminino", 4900.0, 4300.0, 1);
        Fornecedor fornecedor = new Fornecedor(3, "SENAC", "Criciúma", "88889999", "00.123.445/0001-00", "888999", "9990-11", "Josefina Perna Fina", "Teste", 15.0);
        Produto produto = new Produto(1, "Tijolo 9 furos", 0.84, fornecedor);
        PedidoVenda pedVenda = new PedidoVenda(1, false, LocalDate.of(2023, 04, 19), 1000.0, produto.getValorVenda(), produto, cliente);
        Compra compra = new Compra(1, LocalDate.of(2023, 04, 19), 10000.0, 0.84, fornecedor, produto);
        FolhaPagto fPag = new FolhaPagto(1, LocalDate.of(2022,04,19), funcionario);

        System.out.println("Valor total do pedido: " + pedVenda.getValorTotalVenda());

        System.out.println("Limite atual do cliente: " + cliente.getLimiteCrediario());
        cliente.setAumentarLimite(5000.0);
        System.out.println("Novo limite: " + cliente.getLimiteCrediario());

        System.out.println(pedVenda);

        cliente.setLimiteUtilizado(pedVenda.getValorTotalVenda());
        System.out.println("Limite utilizado: " + cliente.getLimiteUtilizado());
        System.out.println("Limite disponível: " + cliente.getLimiteCrediario());

        System.out.println(funcionario.getNomePessoa());
        System.out.println("Salário atual: " + funcionario.getSalarioBruto());
        System.out.println("Dissídio de 25%");
        funcionario.setDissidio(25.0);
        System.out.println("Novo salário: " + funcionario.getSalarioBruto());
        System.out.println("Salário Liquido: " + fPag.getSalario());

        System.out.println("Principal Doc Cliente: " + cliente.getDocumentoPrincipal());
        System.out.println("Principal Doc Funcionario: " + funcionario.getDocumentoPrincipal());
        System.out.println("Principal Doc Fornecedor: " + fornecedor.getDocumentoPrincipal());


    }
}