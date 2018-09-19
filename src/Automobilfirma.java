public class Automobilfirma {

    private String name = "Autohaus";

    public static double gesamtumsatzermitteln (double ges1, double ges2){
        return ges1+ges2;
    }
    public static void main (String agrv[]){
        Werk1 [] w = new Werk1[1];
        w[0] = new Werk1("Ferrari",60000,10);

        Werk2 [] w1 = new Werk2[1];
        w1[0] = new Werk2("Lamborghini",120000,20);

           System.out.println("Die Firma Noubi Simeu, Christian: \n"+w[0].toString()+"\n\n");
           System.out.println("Die Firma Noubi tresor: \n"+w1[0].toString()+"\n\n");
           System.out.println("Die gesammte umsatz unsere Firma ist "+gesamtumsatzermitteln(Werk1.werksumsatzErmitteln1(),Werk2.werksumsatzErmitteln2())+"€uro");

    }
}
