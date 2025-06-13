import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = (int) entrada.nextDouble();
            
            System.out.println("Número digitado: " + numero);
        }
    }
}
