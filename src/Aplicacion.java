import java.util.Scanner;


public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********Datos del Cliente**********");
        String nombre = "Peter Parker";
        String tipoCuenta = "ahorros";
        double saldo = 1500;
        int opcion = 0;
        System.out.println("""
            Nombre: %s
            Tipo de Cuenta: %s
            Saldo Disponible: %f
            """.formatted(nombre,tipoCuenta,saldo));
        
        while (opcion != 9){
            System.out.println("**************BIENVENIDOS AL SISTEMA***********");
            System.out.println("""
                    Elige una opcion:
                    1.Consultar Saldo
                    2.Retirar
                    3.Depositar
                    9.Salir 
                    """);
            System.out.println("Ingrese la opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es de: "+ saldo+" US");
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    double valor = sc.nextDouble();
                    if (valor > saldo){
                        System.out.println("Su saldo actual es insuficiente");
                    }else{
                        saldo -= valor;
                        System.out.println("Retiro "+ valor + " US");
                        System.out.println("Su nuevo saldo es de: "+ saldo +" US");
                    }
                    break;
                case 3:
                    System.out.println("Cuanto dinero desea depositar a su cuenta?");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Su nuevo saldo es: "+saldo+" US");
                    break;
                case 9:
                    System.out.println("Saliendo del sistema. Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Error!!. Ingrese un valor correcto");
                    break;
            }
        }

    }
    
}
