public abstract class Fahrzeug {

    protected String produktname;
    protected double preis;
    protected double verkaufsmenge;


    public String getProduktname() {
        return produktname;
    }

    public void setProduktname(String produktname) {
        this.produktname = produktname;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getVerkaufsmenge() {
        return verkaufsmenge;
    }

    public void setVerkaufsmenge(double verkaufsmenge) {
        this.verkaufsmenge = verkaufsmenge;
    }

}
