public class Buch {
    private String titel;
    private String autor;
    private double preis;
    private int seitenanzahl;

    public Buch(String titel, String autor, double preis, int seitenanzahl) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.seitenanzahl = seitenanzahl;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreis() {
        return preis;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }
}
