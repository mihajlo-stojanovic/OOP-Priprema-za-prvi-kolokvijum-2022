package aktivnosti;

import java.util.ArrayList;
import java.util.Collections;
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
            if (aktivnost instanceof PromenaStudijskogPrograma) {
                PromenaStudijskogPrograma promena
                        = (PromenaStudijskogPrograma) aktivnost;
                this.studProgramOznaka = promena.getOznaka();
                this.broj = promena.getBrojUpisa();
                this.godinaUpisa = promena.getGodinaUpisa();
                UpisGodine upis = new UpisGodine(
                        promena.getGodina(), promena.getMesec(),
                        promena.getDan());
                upis.setGodinaKojuUpisuje(promena.getGodinaStudija());
                this.aktivnosti.add(upis);
            }
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

    private int godina(int semestar) {
        if (semestar % 2 == 0)
            return semestar / 2;
        return semestar / 2 + 1;
    }

    public boolean slusaPredmet(Predmet predmet) {
        if (this.polozeniPredmeti.contains(predmet))
            return false;
        int godinaStudija = this.vratiGodinuStudija();
        if (this.godina(predmet.getSemestar()) != godinaStudija)
            return false;
        Collections.sort(this.getAktivnosti());
        AktivnostStudenta aktivnost = this.aktivnosti.get(
                this.aktivnosti.size() - 1);
        if (aktivnost instanceof UpisGodine) {
            UpisGodine upis = (UpisGodine) aktivnost;
            if (!upis.getPrenetiPredmeti().contains(predmet))
                return false;
        }
        if (aktivnost instanceof ObnovaGodina) {
            ObnovaGodina obnova = (ObnovaGodina) aktivnost;
            if (!obnova.getPredmetiKojeUpisuje().contains(predmet))
                return false;
        }
        return true;
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
