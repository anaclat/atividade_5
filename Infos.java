import java.util.Scanner;

public class Infos {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Solicita a altura
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Limpa o buffer do Scanner para evitar problemas com o próximo input (se houver)
        scanner.nextLine();

        // Exibe as informações de forma organizada
        System.out.println("\nInformações do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
