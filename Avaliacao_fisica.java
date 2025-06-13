import java.util.Scanner;
public class Avaliacao_fisica {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = entrada.nextLine();
System.out.println("Você digitou o nome: " + nome);

System.out.print("Digite sua altura em metros: ");
double altura = entrada.nextDouble();
System.out.println("Você digitou a altura: " + altura);

System.out.print("Digite seu peso em kg: ");
double peso = entrada.nextDouble();
System.out.println("Você digitou o peso: " + peso);

double imc = peso / (altura * altura);


System.out.printf("%s, seu IMC é: %.2f%n", nome, imc);
entrada.close();


    }
      }
