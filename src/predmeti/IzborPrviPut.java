package predmeti;

public class IzborPrviPut extends StudentIzbor {

    private IzborZaPrviPutStudenata izbor;

    IzborPrviPut(Student student) {
        super(student);
    }

    @Override
    public boolean dodajIzbor(IzborStudenta izborStudenta) {
        if (izborStudenta instanceof IzborniPredmet)
            return false;
        if (izborStudenta.mozeDaIzabere(super.getStudent())) {
            this.izbor = (IzborZaPrviPutStudenata) izborStudenta;
            return true;
        }
        return false;
    }
}
