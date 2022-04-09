package karantin;

public class Karantin {
    public static void main(String[] args) {
        Nastavnik nastavnik1 = new Nastavnik("m_stojanovic");
        Nastavnik nastavnik2 = new Nastavnik("ssubotic");
        Student student1 = new Student("mtosic14121ri");
        Student student2 = new Student("vpilipovic4521ri");
        Student student3 = new Student("mignjatovic5221ri");
        Sastanak sastanak1 = new Sastanak(
                "Uvod u programiranje", 9, 11);
        Sastanak sastanak2 = new Sastanak(
                "OOP", 9, 21);
        Sastanak sastanak3 = new Sastanak(
                "Analiza", 13, 16);
        CentralniRegistar.getRegistar().pokreniSastanak(sastanak1, nastavnik1);
        CentralniRegistar.getRegistar().pokreniSastanak(sastanak2, nastavnik2);
        CentralniRegistar.getRegistar().zavrsiSastanak(sastanak1, nastavnik1);
        CentralniRegistar.getRegistar().zavrsiSastanak(sastanak3, nastavnik2);
        CentralniRegistar.getRegistar().stampajPrisustvoSortirano();
    }
}
