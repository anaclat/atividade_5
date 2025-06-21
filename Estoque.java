import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Código do produto: ");
        int cod = scanner.nextInt();
        
        System.out.print("Preço unitário: ");
        double preço = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quant = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("O produto está ativo (true/false): ");
        boolean sn = scanner.nextBoolean();

        double totest = preço * quant;
        System.out.println("");
        System.out.println("--- Detalhes do Produto ---");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Código do produto: " + cod);
        System.out.printf("Preço unitário: R$ %.2f\n", preço);
        System.out.println("Quantidade em estoque: " + quant);
        System.out.printf("Valor total do estoque: R$ %.2f\n", totest);
        System.out.println("Produto está ativo: " + (sn ? "Sim" : "Não"));

        scanner.close();
    }
}
