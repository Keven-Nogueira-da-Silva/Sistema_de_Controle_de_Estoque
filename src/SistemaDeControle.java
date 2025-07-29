public class SistemaDeControle {

    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotalVendido;

    public SistemaDeControle(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotalVendido() {
        return valorTotalVendido;
    }

    public void setQuantidade(int novaQuandidade) {
        if (novaQuandidade >= 0) {
            this.quantidade = novaQuandidade;
        } else {
            System.out.println("Quantidade não pode ser negativa.");
        }
    }

    public void setValorTotalVendido(double valor) {
        this.valorTotalVendido = valor;
    }

    public void  adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Estoque adicionado com sucesso.");
        } else {
            System.out.println("Quantidade inválida. ");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidade && quantidade > 0) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Não há estoque suficente");
        }
    }

    public void vender(int quantidade) {
        if(quantidade <= this.quantidade && quantidade > 0) {
            this.quantidade -= quantidade;
            double valorVenda = quantidade * this.preco;
            this.valorTotalVendido += valorVenda;
            System.out.println("Venda realizada: R$ " + valorVenda);
        } else {
            System.out.println("Estoque insuficiente para a venda. ");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$" + preco);
        System.out.println("Quantadade em estoque: " + quantidade);
    }

    public void consultarTotalVendido() {
        System.out.println("Total vendido: R$ " + valorTotalVendido);
    }
}
