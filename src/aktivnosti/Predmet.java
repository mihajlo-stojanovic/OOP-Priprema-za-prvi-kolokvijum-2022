package aktivnosti;

import java.util.Objects;

public class Predmet {

    private String naziv;

    private int espb;

    private int semestar;

    public Predmet(String naziv, int espb, int semestar) {
        this.naziv = naziv;
        this.espb = espb;
        this.semestar = semestar;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return Objects.equals(naziv, predmet.naziv);
    }
}
