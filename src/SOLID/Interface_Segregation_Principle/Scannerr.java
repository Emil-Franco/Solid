package SOLID.Interface_Segregation_Principle;
import java.util.Scanner;
public class Scannerr implements IScannable {
    public void scan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int numero = scanner.nextInt();

        System.out.println("Usted ingreso: " + " " + numero);


    }
}
