package karantin;

import java.util.ArrayList;
import java.util.List;

public class CentralniRegistar {

    private static CentralniRegistar REGISTAR = new CentralniRegistar();

    private List<Sastanak> zakazaniSastanci = new ArrayList<>();

    private List<Sastanak> odrzaniSastanci = new ArrayList<>();

    private CentralniRegistar() {

    }

    public void zakaziSastanak(Sastanak sastanak) {

    }

    public void otkaziSastanak(Sastanak sastanak) {

    }

    public void pokreniSastanak(Sastanak sastanak, Nastavnik nastavnik) {

    }

    public void zavrsiSastanak(Sastanak sastanak, Nastavnik nastavnik) {

    }

    public void stampajPrisustvoSortirano() {

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
