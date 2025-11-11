import java.util.Scanner;

public class exercicihores {
    public static void main(String[] args) {
        int hores;
        double tarifa;
        double imposts=0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas: ");
        hores = sc.nextInt();
        System.out.println("Introduce el precio por hora: ");
        tarifa = sc.nextDouble();
        double sueldoBruto = 0;
        if (hores <= 35) {
            sueldoBruto = hores * tarifa;
        } else {
            sueldoBruto = hores * tarifa + (hores - 35) * (tarifa * 1.5);

            if (sueldoBruto <= 500) {
                imposts = 0.0;

            }
            if (sueldoBruto <= 900) {
                imposts = (sueldoBruto - 500) * 0.25;

            }
            if (sueldoBruto >= 900) {
                imposts = (400 * 0.25) + ((sueldoBruto - 900) * 0.45);

            }
        }
        System.out.println("Tu sueldo bruto es: " + sueldoBruto);
        System.out.println("Tu sueldo neto es: " + (sueldoBruto-imposts));

        
    sc.close();
    }
}
