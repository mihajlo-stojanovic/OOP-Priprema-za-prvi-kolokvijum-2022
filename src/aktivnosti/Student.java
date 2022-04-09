package aktivnosti;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studProgramOznaka;

    private int broj;

    private int godinaUpisa;

    private List<AktivnostStudenta> aktivnosti = new ArrayList<>();

    private List<Predmet> polozeniPredmeti = new ArrayList<>();

    public int getEspb() {
        int res = 0;
        for (Predmet predmet : polozeniPredmeti) {
            res += predmet.getEspb();
        }
        return res;
    }

    public boolean dodajAktivnost(AktivnostStudenta aktivnost) {
        if (aktivnost.proveriUslov(this)) {
            this.aktivnosti.add(aktivnost);
            return true;
        }
        return false;
    }

    public int vratiGodinuStudija() {
        if (this.aktivnosti.isEmpty())
            return 0;
        this.aktivnosti.sort(null);
        return this.aktivnosti.get(this.aktivnosti.size() - 1)
                .getGodinaStudija();
    }

    public boolean jePonovac() {
        if (this.aktivnosti.size() < 2)
            return false;
        this.aktivnosti.sort(null);
        return this.aktivnosti.get(this.aktivnosti.size() - 1)
                instanceof ObnovaGodina;
    }

    public boolean slusaPredmet(Predmet predmet) {
        return false;
    }

    public String getStudProgramOznaka() {
        return studProgramOznaka;
    }

    public void setStudProgramOznaka(String studProgramOznaka) {
        this.studProgramOznaka = studProgramOznaka;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public List<AktivnostStudenta> getAktivnosti() {
        return aktivnosti;
    }

    public void setAktivnosti(List<AktivnostStudenta> aktivnosti) {
        this.aktivnosti = aktivnosti;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }
}
