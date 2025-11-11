import java.util.Scanner;

public class exercici10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Qué vols beure? Tenim: cafe, te i xocolata. ");
        String beguda= sc.nextLine();
        System.out.println("Tria una pasta. Tenim: croissant, ensaimada o magdalena ");
        String pasta=sc.nextLine();
        System.out.println("El vols per emportar? (S/N)");
        String emportar=sc.nextLine();
        double preciBeguda;
        double preciPasta=0.0;
        double PreciEmportar=0.00;
        double preciTotal;

        if(!beguda.equalsIgnoreCase("cafe") && !beguda.equalsIgnoreCase("te") && !beguda.equalsIgnoreCase("xocolata")){
            System.out.println("No tenim eixa beguda. S'ha acabat.");}
        if(!beguda.equalsIgnoreCase("croissant") && !beguda.equalsIgnoreCase("ensaimada") && !beguda.equalsIgnoreCase("magdalena")){
            System.out.println("No tenim eixa pasta. S'ha acabat.");}

        if (beguda.equalsIgnoreCase("cafe")){
            preciBeguda=1.2;}
            else if (beguda.equalsIgnoreCase("te")) {
                preciBeguda=1.0;}
                else {
                    preciBeguda=1.5;
                }
    
            
            if(pasta.equalsIgnoreCase("croissant"))

    {
        preciPasta = 1.10;
    }else if(pasta.equalsIgnoreCase("ensaimada"))
    {
        preciPasta = 1.4;
    }else
    {
        preciPasta = 0.9;
    }
   preciTotal= preciBeguda + preciPasta;
    if (emportar.equalsIgnoreCase("s")){
        preciTotal= preciTotal +PreciEmportar;
     }
    

    

    System.out.println("Beguda escollida "+beguda +": "+ preciBeguda + " € ");
    System.out.println("Has escollita la pasta: " + pasta + ": " + preciPasta + "€");
    System.out.println("Vols per emportar? " + emportar+ ": " + PreciEmportar);
    System.out.println("Total: " + preciTotal );

sc.close();
}
}