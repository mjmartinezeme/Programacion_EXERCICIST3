import java.util.Scanner;

public class exercici6 {

    public static void main(String[] args) {
        // Crear Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        final double precioCm2 = 0.01;

        System.out.println(" ====CALCULADORA DE PRECIO DE BANDERAS==== ");
        System.out.println("=======================================");

        System.out.println("Introduce el alto: ");
        double alto = sc.nextDouble();
        System.out.println("Introduce el ancho: ");
        double ancho = sc.nextDouble();
        double area = alto * ancho;
        double precioBandera = area * precioCm2;
        double precioEscudo = 2.5;
        double gastosEnvio = 3.25;

        System.out.println("¿Quieres el escudo bordado? (S/N)");
        char escudo = sc.next().toLowerCase().charAt(0);
        double precioFinal;
        precioFinal = precioBandera + gastosEnvio;

        if (escudo != 's') {
            System.out.println("RESUMEN FINAL DE LA COMPRA");
            System.out.println("=======================================");
            System.out.println("Bandera de " + area + "cm2");
            System.out.println("Sin escudo: 0.00.");
            System.out.println("Gastos de envío: 3.25.");
            System.out.println("Total: " + precioFinal);
        }

        if (escudo == 's') {
            precioFinal = precioFinal + precioEscudo;
            System.out.println("=======================================");
            System.out.println("RESUMEN FINAL DE LA COMPRA");
            System.out.println("=======================================");
            System.out.println("Bandera de " + area + " cm2");
            System.out.println("Escudo 2.50 euros.");
            System.out.println("Gastos de envío: 3.25 euros.");
            System.out.println("Total: " + precioFinal);
        }
        sc.close();
    }
}
/*
 * Gràcies. Aquí teniu el desglossament de la vostra compra.
 * Bandera de 700 cm2: 7,00 €
 * Sense escut: 0,00 €
 * Despeses d'enviament: 3,25 €
 * Total: 10,25 €
 */