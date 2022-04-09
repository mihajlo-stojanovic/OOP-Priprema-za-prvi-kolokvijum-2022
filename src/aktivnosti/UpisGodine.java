package aktivnosti;

import java.util.ArrayList;
import java.util.List;

public class UpisGodine extends AktivnostStudenta {

    private int godinaKojuUpisuje;

    private List<Predmet> prenetiPredmeti = new ArrayList<>();

    public UpisGodine(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
    }

    @Override
    public int getGodinaStudija() {
        return godinaKojuUpisuje;
    }

    @Override
    public boolean proveriUslov(Student student) {
        return false;
    }

    public int getGodinaKojuUpisuje() {
        return godinaKojuUpisuje;
    }

    public void setGodinaKojuUpisuje(int godinaKojuUpisuje) {
        this.godinaKojuUpisuje = godinaKojuUpisuje;
    }

    public List<Predmet> getPrenetiPredmeti() {
        return prenetiPredmeti;
    }

    public void setPrenetiPredmeti(List<Predmet> prenetiPredmeti) {
        this.prenetiPredmeti = prenetiPredmeti;
    }
}
