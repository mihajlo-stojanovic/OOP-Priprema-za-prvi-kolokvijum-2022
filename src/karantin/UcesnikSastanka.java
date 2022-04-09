package karantin;

import java.util.Objects;

public abstract class UcesnikSastanka {

    private String korisnickoIme;

    public UcesnikSastanka(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public abstract void ucestvuj(Sastanak sastanak);
    public abstract void napusti(Sastanak sastanak);

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    @Override
    public String toString() {
        return "UcesnikSastanka{" +
                "korisnickoIme='" + korisnickoIme + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UcesnikSastanka that = (UcesnikSastanka) o;
        return Objects.equals(korisnickoIme, that.korisnickoIme);
    }
}
