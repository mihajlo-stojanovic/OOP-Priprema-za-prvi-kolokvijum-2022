package predmeti;

import java.util.ArrayList;
import java.util.List;

public class IzborniModul implements IzborZaPrviPutStudenata {

    private String naziv;

    private List<Predmet> predmeti = new ArrayList<>();

    public IzborniModul(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        if (student.vratiTrenutnuGodinuStudija() != 3)
            return false;
        if (student.jePonovac())
            return false;
        if (student.getEspb() < 150)
            return false;
        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
}
