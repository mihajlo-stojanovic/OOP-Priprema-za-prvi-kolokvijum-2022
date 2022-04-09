package predmeti;

public class Main {
    public static void main(String[] args) {
        IzborFactory izborFactory = new IzborFactory();
        Student student = new Student(
                OznakaPlana.RN, 61, 2019);
        StudentIzbor studentIzbor = izborFactory.kreirajIzborStudenta(
                student);
    }
}
