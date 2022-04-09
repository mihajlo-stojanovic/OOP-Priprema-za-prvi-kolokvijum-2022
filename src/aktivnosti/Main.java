package aktivnosti;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudProgramOznaka("RN");
        student.setBroj(61);
        student.setGodinaUpisa(2019);
        UpisGodine upisGodine1 = new UpisGodine(1, 1, 1);
        upisGodine1.setGodinaKojuUpisuje(1);
        UpisGodine upisGodine2 = new UpisGodine(1, 1, 2);
        upisGodine2.setGodinaKojuUpisuje(2);
        ObnovaGodina obnovaGodina2 = new ObnovaGodina(1, 2, 1);
        obnovaGodina2.setGodinaObnove(2);
        PromenaStudijskogPrograma promenaStudijskogPrograma
                = new PromenaStudijskogPrograma(
                        1, 3, 1, student,
                "RI", 61, 2019);
        student.dodajAktivnost(upisGodine1);
        student.dodajAktivnost(upisGodine2);
        student.dodajAktivnost(obnovaGodina2);
        student.dodajAktivnost(promenaStudijskogPrograma);
        for (AktivnostStudenta ak : student.getAktivnosti()) {
            System.out.println(ak);
        }
    }
}
