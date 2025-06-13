import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a largura: ");
        float largura = (float) entrada.nextDouble();
        
        System.out.print("Digite a altura: ");
        float altura = (float) entrada.nextDouble();
        
        int area = (int) (largura * altura);
        
        System.out.println("A área do retângulo é: " + area + " metros");
        
        entrada.close();
    }
}
