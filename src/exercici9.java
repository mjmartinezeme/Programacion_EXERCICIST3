import java.util.Scanner;

public class exercici9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete en kg: ");
        double pesoPaquete = sc.nextDouble();
        sc.nextLine();
        double precioBase;
        if (pesoPaquete < 1) {
            precioBase = 3.0;
        } else if ((pesoPaquete >= 1) && (pesoPaquete <= 5)) {
            precioBase = 5.0;

        } else {
            precioBase = 10.0;
        }
    
        System.out.println("Es un envío internacional? (S/N): ");

        char envio = sc.nextLine().charAt(0);
        double envioInternacional = 0.0;
        if (envio == 's'|| envio == 'S') {
            envioInternacional = 7.50;
        }

        System.out.println("===== RESUMEN PRECIO TOTAL ===== ");
        System.out.println("Peso del paquete:  " + pesoPaquete);
        System.out.println("Envio intenacional? (S/N) :" + envio);
        System.out.println("Precio base por kg: " + precioBase);
        System.out.println("Suplemento: " + envioInternacional);
        System.out.println("Total paquete: " + (precioBase + envioInternacional));

        sc.close();
    }
}
