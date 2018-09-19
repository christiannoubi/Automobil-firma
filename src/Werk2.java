public class Werk2 extends Fahrzeug {

    public static String werkStandort = "Dschang";
    private static double werksumsatz;

    public Werk2( String produktname, double preis, double verkaufsmenge){

        this.produktname = produktname;
        this.preis = preis;
        this.verkaufsmenge = verkaufsmenge;
        werksumsatz = preis * verkaufsmenge;
    }

    public static String werkStandortErmitteln() {
        return werkStandort;
    }


    public static double werksumsatzErmitteln2(){
        return werksumsatz;
    }


    public String toString() {
        String werk2 = "verkauft eine "+this.getProduktname()+" fuer "+this.getPreis()+" €uro und die anzahl der verkaufenene ferrari ist "+this.getVerkaufsmenge()
                +" sie befindet sich in "+werkStandort+ " und ihr Umsatz ist :"+werksumsatz+" €uro";
        return werk2;
    }
}
