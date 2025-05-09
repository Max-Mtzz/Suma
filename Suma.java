import java.util.Scanner;

public class Suma{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int suma;

        System.out.println("Ingresa tu primer numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingresa tu segundo numero: ");
        int numero2 = leer.nextInt();
        System.out.println("Ingresa tu tercer numero: ");
        int numero3 = leer.nextInt();
        System.out.println("Ingresa tu cuarto numero: ");
        int numero4 = leer.nextInt();

        suma = numero1+numero2+numero3+numero4;

        System.out.println("El resultado es: "+ suma);
    }
}