import java.util.Scanner;

public class Lecturas {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu pelicula favorita");
        String pelicula = datos.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDeLanzamiento  = datos.nextInt();
        System.out.println("Que nota le das ha esta pelicula");
        float puntuacion = datos.nextFloat();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);

    }
}
