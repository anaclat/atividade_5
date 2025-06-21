import java.util.Scanner;

public class Calculo_emperatura {
    public static void main(String[] args) {
        final int CONVERSAO = 32;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextInt();
        
        double fahrenheit = celsius * 9/5 + CONVERSAO;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        double kelvin = celsius + 273;
        System.out.println("Temperatura em Kelvin: " + kelvin);

        input.close();
    }
}
