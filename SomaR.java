// biblioteca padrão
import java.util.Scanner;

public class SomaR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o um número real: ");
      // leitura do primeiro numero
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite outro número real: ");
      // leitura do segundo numero
        double numero2 = scanner.nextDouble();
        
        double soma = numero1 + numero2;
        // resultado
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
