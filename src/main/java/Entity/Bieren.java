package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bieren {

    private int BierNr;
    private String Naam;
    private int BrouwerNr;
    private int SoortNr;
    private double Alcohol;

    public Bieren() {
    }


    public Bieren(int bierNr, String naam, int brouwerNr, int soortNr, double alcohol) {
        BierNr = bierNr;
        Naam = naam;
        BrouwerNr = brouwerNr;
        SoortNr = soortNr;
        Alcohol = alcohol;
    }

    @Id
    public int getBierNr() {
        return BierNr;
    }

    public void setBierNr(int bierNr) {
        BierNr = bierNr;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public int getBrouwerNr() {
        return BrouwerNr;
    }

    public void setBrouwerNr(int brouwerNr) {
        BrouwerNr = brouwerNr;
    }

    public int getSoortNr() {
        return SoortNr;
    }

    public void setSoortNr(int soortNr) {
        SoortNr = soortNr;
    }

    public double getAlcohol() {
        return Alcohol;
    }

    public void setAlcohol(double alcohol) {
        Alcohol = alcohol;
    }
}
