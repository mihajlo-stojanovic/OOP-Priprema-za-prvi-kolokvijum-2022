package predmeti;

import java.util.ArrayList;
import java.util.List;

public class IzborPonovca extends StudentIzbor {

    private List<IzborniPredmet> izborniPredmeti = new ArrayList<>();

    IzborPonovca(Student student) {
        super(student);
    }

    @Override
    public boolean dodajIzbor(IzborStudenta izborStudenta) {
        if (izborStudenta.mozeDaIzabere(super.getStudent())
                && izborStudenta instanceof IzborniPredmet) {
            this.izborniPredmeti.add((IzborniPredmet) izborStudenta);
            return true;
        }
        return false;
    }
}
