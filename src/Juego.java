import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int intentos = 1;
        int vidas = 5;
        int numeroAdivinar = new Random().nextInt(10);
        
        while (intentos <= vidas){
            System.out.println("Ingrese el numero a adivinar del 1 al 10");
            valor = sc.nextInt();
            if (valor == numeroAdivinar){
                System.out.println("Adivinaste el número!!!");
                break;
            }
            else{
                System.out.printf("Sigue intentando te quedan %d intentos",vidas - intentos);
                intentos++;
                
            }
        }

    }
}
