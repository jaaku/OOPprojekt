public class Kanne {
    public String kuupäev;
    public String nimi;
    public String selgitus;
    public double deebetsumma;
    public Konto deebetkonto;
    public double kreeditsumma;
    public Konto kreeditkonto;

    public Kanne(String kuupäev, String nimi, String selgitus, double deebetsumma, Konto deebetkonto, double kreeditsumma, Konto kreeditkonto) {
        this.kuupäev = kuupäev;
        this.nimi = nimi;
        this.selgitus = selgitus;
        this.deebetsumma = deebetsumma;
        this.deebetkonto = deebetkonto;
        this.kreeditsumma = kreeditsumma;
        this.kreeditkonto = kreeditkonto;
    }

    @Override
    public String toString() {
        return "Kanne{" +
                "kuupäev='" + kuupäev + '\'' +
                ", nimi='" + nimi + '\'' +
                ", selgitus='" + selgitus + '\'' +
                ", deebetsumma=" + deebetsumma +
                ", deebetkonto=" + deebetkonto +
                ", kreeditsumma=" + kreeditsumma +
                ", kreeditkonto=" + kreeditkonto +
                '}';
    }
}
