package aktivnosti;

public class PromenaStudijskogPrograma extends AktivnostStudenta {

    private String oznaka;

    private int brojUpisa;

    private int godinaUpisa;

    private Student student;

    public PromenaStudijskogPrograma(int godina, int mesec, int dan,
                                     Student student,
                                     String oznaka, int brojUpisa, int godinaUpisa) {
        super(godina, mesec, dan);
        this.student = student;
        this.oznaka = oznaka;
        this.brojUpisa = brojUpisa;
        this.godinaUpisa = godinaUpisa;
    }

    @Override
    public int getGodinaStudija() {
        return this.student.vratiGodinuStudija();
    }

    @Override
    public boolean proveriUslov(Student student) {
        if (this.student != student)
            return false;
        int espb = student.getEspb();
        if (espb < 48)
            return false;
        return true;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getBrojUpisa() {
        return brojUpisa;
    }

    public void setBrojUpisa(int brojUpisa) {
        this.brojUpisa = brojUpisa;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    @Override
    public String toString() {
        return "PromenaStudijskogPrograma{" +
                super.toString() +
                "oznaka='" + oznaka + '\'' +
                ", brojUpisa=" + brojUpisa +
                ", godinaUpisa=" + godinaUpisa +
                '}';
    }
}
