import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> buecher;

    public Bibliothek(List<Buch> buecher) {
        this.buecher = buecher;
    }

    public List<Buch> BuecherVonAutor(String autor) {
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

    public double DurchschnittSeiten(List<Buch> buecher) {

        if(buecher == null || buecher.isEmpty()) {
            return 0.0;
        }

        int count = 0;
        double summe = 0;

        for (Buch buch : buecher) {
            summe += buch.getSeitenanzahl();
            count++;
        }
        double ergebnis = summe / count;
        return ergebnis;
    }
}
