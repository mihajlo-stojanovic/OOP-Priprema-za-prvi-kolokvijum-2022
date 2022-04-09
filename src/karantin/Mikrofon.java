package karantin;

public class Mikrofon extends UredjajZaSnimanje {
    @Override
    public void pokreniSnimak(Snimak snimak) {
        System.out.println(snimak.getIme());
    }

    @Override
    public void zavrsiSnimak(Snimak snimak) {

    }

    @Override
    public Snimak kreirajSnimak(String ime, String tip) {
        Snimak snimak = new Snimak(ime);
        snimak.setTip(tip);
        return snimak;
    }
}
