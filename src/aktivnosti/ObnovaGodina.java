package aktivnosti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObnovaGodina extends AktivnostStudenta {

    private int godinaObnove;

    private List<Predmet> predmetiKojeUpisuje = new ArrayList<>();

    public ObnovaGodina(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
    }

    @Override
    public int getGodinaStudija() {
        return godinaObnove;
    }

    @Override
    public boolean proveriUslov(Student student) {
        if (student.getAktivnosti().isEmpty())
            return false;
        Collections.sort(student.getAktivnosti());
        AktivnostStudenta aktivnost = student.getAktivnosti()
                .get(student.getAktivnosti().size() - 1);
        return aktivnost.getGodinaStudija() == godinaObnove;
    }

    public int getGodinaObnove() {
        return godinaObnove;
    }

    public void setGodinaObnove(int godinaObnove) {
        this.godinaObnove = godinaObnove;
    }

    public List<Predmet> getPredmetiKojeUpisuje() {
        return predmetiKojeUpisuje;
    }

    public void setPredmetiKojeUpisuje(List<Predmet> predmetiKojeUpisuje) {
        this.predmetiKojeUpisuje = predmetiKojeUpisuje;
    }
}
