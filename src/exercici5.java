
import java.util.Scanner;

public class exercici5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix les hores treballades: ");
        double hores = entrada.nextDouble();
        System.out.print("Introdueix la tarifa per hora: ");
        double tarifa = entrada.nextDouble();
        double salariBrut;
        if (hores <= 35) {
            salariBrut = hores * tarifa;
        } else {
            salariBrut = 35 * tarifa + (hores - 35) * tarifa * 1.5;
        }
        double impostos = 0;
        if (salariBrut <= 500)
            impostos = 0;
        else {
            if (salariBrut <= 900) {
                impostos = (salariBrut - 500) * 0.25;
            } else {
                //els primers 400 el 25% la resta sbrut -500-400 per 45%
                impostos = (400 * 0.25) + ((salariBrut - 900) * 0.45);
            }
        }
        System.out.println("El teu salari es: " + (salariBrut - impostos));
        entrada.close();
    }
}