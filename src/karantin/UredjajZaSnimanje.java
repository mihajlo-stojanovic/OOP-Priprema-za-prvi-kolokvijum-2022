package karantin;

import java.util.Objects;

public abstract class UredjajZaSnimanje {

    private String proizvodjac;

    private String tipSnimka;

    public abstract void pokreniSnimak(Snimak snimak);
    public abstract void zavrsiSnimak(Snimak snimak);
    public abstract Snimak kreirajSnimak(String ime, String tip);

    public void dodajUKolekciju(Sastanak sastanak, Snimak snimak) {
        sastanak.getSnimci().add(snimak);
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getTipSnimka() {
        return tipSnimka;
    }

    public void setTipSnimka(String tipSnimka) {
        this.tipSnimka = tipSnimka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UredjajZaSnimanje that = (UredjajZaSnimanje) o;
        return Objects.equals(proizvodjac, that.proizvodjac) && Objects.equals(tipSnimka, that.tipSnimka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proizvodjac, tipSnimka);
    }
}
