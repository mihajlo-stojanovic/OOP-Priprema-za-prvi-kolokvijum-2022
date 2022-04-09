package karantin;

import java.util.ArrayList;
import java.util.List;

public class Sastanak implements Comparable<Sastanak> {

    private String predmet;

    private int satPocetka;

    private int satZavrsetka;

    private boolean aktivan;

    private List<UcesnikSastanka> ucesnici = new ArrayList<>();

    private Nastavnik domacin;

    public Sastanak(String predmet, int satPocetka, int satZavrsetka) {
        this.predmet = predmet;
        this.satPocetka = satPocetka;
        this.satZavrsetka = satZavrsetka;
    }

    public void dodajUcesnika(UcesnikSastanka ucesnikSastanka) {

    }

    public void ukloniUcesnika(UcesnikSastanka ucesnikSastanka) {

    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getSatPocetka() {
        return satPocetka;
    }

    public void setSatPocetka(int satPocetka) {
        this.satPocetka = satPocetka;
    }

    public int getSatZavrsetka() {
        return satZavrsetka;
    }

    public void setSatZavrsetka(int satZavrsetka) {
        this.satZavrsetka = satZavrsetka;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public List<UcesnikSastanka> getUcesnici() {
        return ucesnici;
    }

    public void setUcesnici(List<UcesnikSastanka> ucesnici) {
        this.ucesnici = ucesnici;
    }

    public Nastavnik getDomacin() {
        return domacin;
    }

    public void setDomacin(Nastavnik domacin) {
        this.domacin = domacin;
    }

    @Override
    public int compareTo(Sastanak sastanak) {
        return 0;
    }

    @Override
    public String toString() {
        return "Sastanak{" +
                "predmet='" + predmet + '\'' +
                ", satPocetka=" + satPocetka +
                ", satZavrsetka=" + satZavrsetka +
                ", aktivan=" + aktivan +
                ", ucesnici=" + ucesnici +
                ", domacin=" + domacin +
                '}';
    }
}
