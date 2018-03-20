public class Konto {
    public String nimi;
    public int number;
    public char tüüp;
    public double algsaldo;

    public Konto(String nimi, int number, char tüüp, double algsaldo) {
        this.nimi = nimi;
        this.number = number;
        this.tüüp = tüüp;
        this.algsaldo = algsaldo;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "nimi='" + nimi + '\'' +
                ", number=" + number +
                ", tüüp=" + tüüp +
                ", algsaldo=" + algsaldo +
                '}';
    }

}
