public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a conversor de temperaturas");
        int celsisus = 180;
        double farenheit = (int)(celsisus * 1.8) + 32;
        System.out.printf("La temperatura %d a farenheit es: %.1f%n",celsisus,farenheit);


    }

}
