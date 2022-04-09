package predmeti;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int brojIndeksa;

    private int godinaUpisa;

    private List<Integer> upisaneGodine = new ArrayList<>();

    private OznakaPlana plan;

    private List<Predmet> polozeniPredmeti = new ArrayList<>();

    public Student(OznakaPlana plan, int brojIndeksa, int godinaUpisa) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.plan = plan;
    }

    public int getEspb() {
        int suma = 0;
        for (Predmet predmet : polozeniPredmeti) {
            suma += predmet.getEspb();
        }
        return suma;
    }

    public int vratiTrenutnuGodinuStudija() {
        return this.upisaneGodine.get(this.upisaneGodine.size() - 1);
    }

    public boolean jePonovac() {
        if (this.upisaneGodine.size() == 1)
            return false;
        return this.vratiTrenutnuGodinuStudija()
                == this.upisaneGodine.get(this.upisaneGodine.size() - 2);
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public List<Integer> getUpisaneGodine() {
        return upisaneGodine;
    }

    public void setUpisaneGodine(List<Integer> upisaneGodine) {
        this.upisaneGodine = upisaneGodine;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }
}
