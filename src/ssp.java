
import java.util.Scanner;


public class ssp {
    public static void main(String[] args) {
        String Pdrag, svar;
        String Cdrag = "";

        Scanner sc = new Scanner(System.in);
        String player = sc.next();

        System.out.println("Dina alternativ:  \n" + "Sten , Sax," + " Pase. ");

        System.out.println();

        int Cint = (int)(Math.random()*2);

        //System.out.println(Cint);

        if (Cint == 0){
            Cdrag = "STEN";
        }
        else if (Cint == 1){
            Cdrag = "SAX";
        }
        else if (Cint == 2){
            Cdrag = "PASE";
        }

        System.out.println("Gör ditt drag: ");
        Pdrag = sc.next();
        Pdrag = Pdrag.toUpperCase();

        System.out.println("Datorn Valde: " + Cdrag + " Du valde: " + Pdrag);

        if(Cdrag .equals(Pdrag)){
            System.out.println("Det blev lika, nu måste du spela igeen och vinna tillbaka pengarna, onajjj dina pengar.");
        }

        if(Cdrag .equals("STEN")){
            if (Pdrag .equals("SAX")) {
                System.out.println("DU förlora");
            }
            else if(Pdrag .equals("PASE")){
                System.out.println("Du vann");
            }
        }


        if(Cdrag .equals("SAX")){
            if (Pdrag .equals("PASE")) {
                System.out.println("DU förlora");
            }
            else if(Pdrag .equals("STEN")){
                    System.out.println("Du vann");
            }
        }

        if(Cdrag .equals("PASE")) {
            if (Pdrag.equals("STEN")) {
                System.out.println("DU förlora");
            }
            else if(Pdrag .equals("SAX")){
                System.out.println("Du vann");
            }
        }
    }
}


