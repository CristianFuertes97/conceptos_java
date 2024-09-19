public class Decisiones {
    public static void main(String[] args) {

        int fechaDelanzamiento = 1999;
        boolean incluidoEnELPlan = true;
        double notaDeLaPelicula = 8.2;
        String plan = "free";
        if (fechaDelanzamiento > 2022){
            System.out.println("Peliculas más populares ");
        }else{
            System.out.println("Peliculas retro que aun valen la pena ver");
        }

        if (incluidoEnELPlan && plan.equals("plus")){
            System.out.println("Disfruta de tu pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual ");
        }
    }
}
