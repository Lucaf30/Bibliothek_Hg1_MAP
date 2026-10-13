import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> buecher;

    public Bibliothek(List<Buch> buecher) {
        this.buecher = buecher;
    }

    public List<Buch> buecherVonAutor(String autor) {
        List<Buch> ergebnis = new ArrayList<>();

        if (autor == null) {
            return ergebnis;
        }

        for (Buch buch : buecher) {
            if (buch.getAutor().equals(autor)) {
                ergebnis.add(buch);
            }
        }
        return ergebnis;
    }

    public double durchschnittSeiten(List<Buch> buecher) {

        if(buecher == null || buecher.isEmpty()) {
            return 0.0;
        }

        int count = 0;
        double summe = 0.0;

        for (Buch buch : buecher) {
            summe += buch.getSeitenanzahl();
            count++;
        }
        double ergebnis = summe / count;
        return ergebnis;
    }

    public List<Buch> maxPreis(List<Buch> buecher, double preis) {
        List<Buch> ergebnis = new ArrayList<>();

        if (buecher == null || buecher.isEmpty()) {
            return ergebnis;
        }

        for (Buch buch : buecher) {
            if (buch.getPreis() <= preis) {
                ergebnis.add(buch);
            }
        }
        return ergebnis;
    }

    public Buch teuersteBuch(List<Buch> buecher) {
        if (buecher == null || buecher.isEmpty()) {
            return null;
        }

        double max = 0;
        Buch teuersteBuch = null;

        for (Buch buch : buecher) {
            if (buch.getPreis() > max) {
                max = buch.getPreis();
                teuersteBuch = buch;
            }
        }
        return teuersteBuch;
    }

    public List<Buch> mindestanzahlVonSeiten(List<Buch> buecher, int min_seiten) {
        List<Buch> ergebnis = new ArrayList<>();

        if (buecher == null || buecher.isEmpty()) {
            return ergebnis;
        }

        for (Buch buch : buecher) {
            if (buch.getSeitenanzahl() >= min_seiten) {
                ergebnis.add(buch);
            }
        }
        return ergebnis;
    }
}
