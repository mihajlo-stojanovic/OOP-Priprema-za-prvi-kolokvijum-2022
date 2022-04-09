package karantin;

import java.util.*;

public class Sastanak implements Comparable<Sastanak> {

    private String predmet;

    private int satPocetka;

    private int satZavrsetka;

    private boolean aktivan;

    private Set<UcesnikSastanka> ucesnici = new HashSet<>();

    private List<Snimak> snimci = new ArrayList<>();

    private Nastavnik domacin;

    public Sastanak(String predmet, int satPocetka, int satZavrsetka) {
        this.predmet = predmet;
        this.satPocetka = satPocetka;
        this.satZavrsetka = satZavrsetka;
    }

    public void dodajUcesnika(UcesnikSastanka ucesnikSastanka) {
        this.ucesnici.add(ucesnikSastanka);
    }

    public void ukloniUcesnika(UcesnikSastanka ucesnikSastanka) {
        this.ucesnici.remove(ucesnikSastanka);
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

    public Set<UcesnikSastanka> getUcesnici() {
        return ucesnici;
    }

    public void setUcesnici(Set<UcesnikSastanka> ucesnici) {
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
        /*if (this.satPocetka < sastanak.satPocetka)
            return -1;
        if (this.satPocetka > sastanak.satPocetka)
            return 1;
        if (this.satZavrsetka < sastanak.satZavrsetka)
            return -1;
        if (this.satZavrsetka > sastanak.satZavrsetka)
            return 1;*/
        int a = Integer.valueOf(this.satPocetka)
                .compareTo(sastanak.satPocetka);
        if (a != 0)
            return a;
        return Integer.valueOf(this.satZavrsetka)
                .compareTo(sastanak.satZavrsetka);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sastanak sastanak = (Sastanak) o;
        return satPocetka == sastanak.satPocetka && satZavrsetka == sastanak.satZavrsetka;
    }

    @Override
    public int hashCode() {
        return Objects.hash(satPocetka, satZavrsetka);
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

    public List<Snimak> getSnimci() {
        return snimci;
    }

    public void setSnimci(List<Snimak> snimci) {
        this.snimci = snimci;
    }
}
