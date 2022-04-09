package predmeti;

public class IzborniPredmet extends Predmet implements IzborStudenta {
    public IzborniPredmet(String naziv, int semestar, int espb, OznakaPlana oznakaPlana) {
        super(naziv, semestar, espb, oznakaPlana);
    }

    private int godina(int semestar) {
        if (semestar % 2 == 0) {
            return semestar / 2;
        }
        return semestar / 2 + 1;
    }

    @Override
    public boolean mozeDaIzabere(Student student) {
        return student.jePonovac()
                && super.getPreduslovi().containsAll(
                        student.getPolozeniPredmeti())
                && !student.getPolozeniPredmeti().contains(this)
                && student.getPlan() == super.getOznakaPlana()
                && this.godina(super.getSemestar())
                        == student.vratiTrenutnuGodinuStudija();
    }
}
