import java.util.Scanner;
public class exercici3 {
    public static void main(String[]args)throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu edad ");
        int edad = entrada.nextInt();
            if (edad <0) {
            System.out.println("La edad introducida no es válida.");
            } else if (edad >=18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad");
            }
            entrada.close();
        }
}