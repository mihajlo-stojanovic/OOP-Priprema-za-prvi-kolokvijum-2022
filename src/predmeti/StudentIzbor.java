package predmeti;

public abstract class StudentIzbor {

    private Student student;

    public StudentIzbor(Student student) {
        this.student = student;
    }

    public abstract boolean dodajIzbor(IzborStudenta izborStudenta);

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
