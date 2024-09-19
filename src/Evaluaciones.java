import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        double contador = 0;

        while (nota != -1){
            System.out.println("Ingrese la nota de puntuacion de la pelicula matrix");
            nota = sc.nextDouble();
            if (nota != -1){
                media += nota;
                contador++;
            }
           
        }
        System.out.println("La media de la puntiacion de la pelicula es: "+ media / contador);

        
    }
}
