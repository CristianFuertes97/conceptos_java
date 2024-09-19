import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota = 0;
        double media = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota que le deseas dar a la paelicula matrix");
            nota = sc.nextDouble();
            media = media + nota;

        }
        System.out.println(media/3);
    }
}
