import java.util.Scanner;

public class Calculo_IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite teu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura [m]: ");
        double altura = scanner.nextDouble();

        double IMC = peso/(altura * altura);
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
        System.out.printf("Imc: %.2f", IMC);

        scanner.close();
    }
}
