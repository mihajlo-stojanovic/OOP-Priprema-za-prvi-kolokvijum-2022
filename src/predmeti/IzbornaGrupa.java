package predmeti;

import java.util.ArrayList;
import java.util.List;

public class IzbornaGrupa implements IzborZaPrviPutStudenata {

    private String oznaka;

    private OznakaPlana plan;

    private List<IzborniPredmet> predmeti = new ArrayList<>();

    public boolean dodajPredmet(IzborniPredmet izborniPredmet) {
        int godinaStudija = this.oznaka.charAt(0) - '0';
        if (izborniPredmet.getSemestar() == godinaStudija * 2
                || izborniPredmet.getSemestar() == godinaStudija * 2 - 1) {
            if (izborniPredmet.getOznakaPlana() == this.plan) {
                if (!this.predmeti.contains(izborniPredmet)) {
                    this.predmeti.add(izborniPredmet);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if (student.jePonovac())
            return false;
        int godina = this.oznaka.charAt(0) - '0';
        if (student.vratiTrenutnuGodinuStudija() != godina)
            return false;
        if (student.getPlan() != this.plan)
            return false;
        for (IzborniPredmet izborniPredmet : predmeti) {
            if (!student.getPolozeniPredmeti()
                    .containsAll(izborniPredmet.getPreduslovi()))
                return false;
        }
        return true;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public List<IzborniPredmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<IzborniPredmet> predmeti) {
        this.predmeti = predmeti;
    }
}
