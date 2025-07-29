import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do produto
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço do produto: R$");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidade = sc.nextInt();

        // Criando o objeto
        SistemaDeControle produto = new SistemaDeControle(nome, preco, quantidade);

        int opcao = -1;

        // Menu interativo
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ver informações do produto");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Vender produto");
            System.out.println("5 - Ver total vendido");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    produto.exibirInformacoes();
                    break;
                case 2:
                    System.out.print("Quantidade para adicionar: ");
                    int addQtd = sc.nextInt();
                    produto.adicionarEstoque(addQtd);
                    break;
                case 3:
                    System.out.print("Quantidade para remover: ");
                    int rmQtd = sc.nextInt();
                    produto.removerEstoque(rmQtd);
                    break;
                case 4:
                    System.out.print("Quantidade a vender: ");
                    int vendaQtd = sc.nextInt();
                    produto.vender(vendaQtd);
                    break;
                case 5:
                    produto.consultarTotalVendido();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
