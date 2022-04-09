package karantin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CentralniRegistar {

    private static CentralniRegistar REGISTAR = new CentralniRegistar();

    private List<Sastanak> zakazaniSastanci = new ArrayList<>();

    private List<Sastanak> odrzaniSastanci = new ArrayList<>();

    private CentralniRegistar() {

    }

    public void zakaziSastanak(Sastanak sastanak) {
        this.zakazaniSastanci.add(sastanak);
    }

    public void otkaziSastanak(Sastanak sastanak) {
        this.zakazaniSastanci.remove(sastanak);
    }

    public void pokreniSastanak(Sastanak sastanak, Nastavnik nastavnik) {
        if (sastanak != null && nastavnik == sastanak.getDomacin()
                && !sastanak.isAktivan()) {
            sastanak.setAktivan(true);
        }
    }

    public void zavrsiSastanak(Sastanak sastanak, Nastavnik nastavnik) {
        if (sastanak != null && nastavnik == sastanak.getDomacin()
                && sastanak.isAktivan()) {
            sastanak.setAktivan(false);
            this.odrzaniSastanci.add(sastanak);
            this.zakazaniSastanci.remove(sastanak);
        }
    }

    public void stampajPrisustvoSortirano() {
        String ime = "ime.txt";
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(ime);
            pw = new PrintWriter(fw);
            for (Sastanak sastanak: zakazaniSastanci) {
                pw.println(sastanak);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static CentralniRegistar getRegistar() {
        return REGISTAR;
    }

    public static void setRegistar(CentralniRegistar REGISTAR) {
        CentralniRegistar.REGISTAR = REGISTAR;
    }

    public List<Sastanak> getZakazaniSastanci() {
        return zakazaniSastanci;
    }

    public void setZakazaniSastanci(List<Sastanak> zakazaniSastanci) {
        this.zakazaniSastanci = zakazaniSastanci;
    }

    public List<Sastanak> getOdrzaniSastanci() {
        return odrzaniSastanci;
    }

    public void setOdrzaniSastanci(List<Sastanak> odrzaniSastanci) {
        this.odrzaniSastanci = odrzaniSastanci;
    }
}
