package predmeti;

public class IzborFactory {

    public StudentIzbor kreirajIzborStudenta(Student student) {
        if (student.jePonovac())
            return new IzborPonovca(student);
        return new IzborPrviPut(student);
    }

}
