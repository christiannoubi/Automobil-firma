public class Werk1 extends Fahrzeug {

    public static String werkStandort = "Batié";
    private static double werksumsatz;

    public Werk1( String produktname, double preis, double verkaufsmenge){

        this.produktname = produktname;
        this.preis = preis;
        this.verkaufsmenge = verkaufsmenge;
        werksumsatz = preis * verkaufsmenge;
    }

    public static String werkStandortErmitteln() {
        return werkStandort;
    }


    public static double werksumsatzErmitteln1(){
         return werksumsatz;
    }


    public String toString() {
        String werk1 = "verkauft eine "+this.getProduktname()+" fuer "+this.getPreis()+" €uro und die anzahl der verkaufenene ferrari ist "+this.getVerkaufsmenge()
                +" sie befindet sich in "+werkStandort+ " und mein Umsatz ist :"+werksumsatz+"€uro";
        return werk1;
    }
}

