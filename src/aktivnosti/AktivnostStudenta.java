package aktivnosti;

public abstract class AktivnostStudenta
        implements Uslovljeno, Comparable<AktivnostStudenta> {

    private int godina;

    private int mesec;

    private int dan;

    public AktivnostStudenta(int godina, int mesec, int dan) {
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
    }

    public abstract int getGodinaStudija();

    @Override
    public int compareTo(AktivnostStudenta aktivnostStudenta) {
        if (this.godina != aktivnostStudenta.godina) {
            return Integer.valueOf(this.godina)
                    .compareTo(aktivnostStudenta.godina);
        }
        if (this.mesec != aktivnostStudenta.mesec) {
            return Integer.compare(this.mesec, aktivnostStudenta.mesec);
        }
        return Integer.compare(this.dan, aktivnostStudenta.dan);
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }
}
