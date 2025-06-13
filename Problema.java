import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        entrada.nextLine();
        
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        entrada.close();
    }
}
