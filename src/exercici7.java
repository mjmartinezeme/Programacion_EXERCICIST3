import java.util.Scanner;

public class exercici7 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
System.out.println("Trieu un sabor (poma, maduixa o xocolate): ");
String sabor = sc.nextLine();
double preuPastis=0.0;
if (sabor.equals("poma")){
    preuPastis=18;
}
if (sabor.equals("maduixa")){
    preuPastis=16;
}
if (sabor.equals("xocolate")){
    preuPastis=15;
    System.out.println("Vols xocolate negre o blanc? " );
    String tipoXoco=sc.nextLine();
    if(tipoXoco.equals("blanc")) {
        preuPastis =16;
    }
}
System.out.println("Vols afegir un poquet de nata? (S/N)");
String nata=sc.nextLine();
if (!nata.equals("s" ) && !nata.equals("n")) {
System.out.println("Error. Has de introducir S o N. ");
}
double preuNata=2.5;
if (nata.equals("s")) {
    preuPastis+= preuNata;
}
System.out.println("Vols afegir el nom? (S/N)");
String nom=sc.nextLine();
double preuNom =2.75;
if (!nom.equals("s" )&& !nom.equals("n")) {
System.out.println("Error. Has de introduir S o N. ");
}
if ((nom.equals("s"))){
    preuPastis+=preuNom;
}
System.out.println("==========RESUM DE LA COMPRA===========");
System.out.println("Sabor triat: " + sabor);
System.out.println("Amb nata? " + nata) ;
System.out.println("Vols el nomb escrit? "+nom);
System.out.println("Preu nom: "+preuNom);
System.out.println("Suplement nata: " +preuNata);
System.out.println("Total pastis: " +preuPastis);
 sc.close();
}
}
