import java.util.Scanner;

public class exercici4 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix la nota (0-10):");
        int nota=entrada.nextInt();

        if (nota<0 || nota>10){
            System.out.println("Error: nota invàlida.");
        } else {
            if (nota<=2) {
                System.out.println("Molt deficient.");
            } else if (nota <=4){
                System.out.println("Insuficient.");
            } else if (nota <=6){
                System.out.println("Bé.");
            } else if (nota <=8){
                System.out.println("Notable.");
            } else {
                System.out.println("Excel·lent.");
             if (nota==10) {
                System.out.println("Felicitats! Tens matrícula d'honor!");
            }
        }
    }
    entrada.close();
    }
}
