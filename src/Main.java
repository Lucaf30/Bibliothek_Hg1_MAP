import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creăm lista de cărți[cite: 1]
        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("Clean Code", "Robert Martin", 45.0, 464));
        buecher.add(new Buch("1984", "George Orwell", 18.0, 328));
        buecher.add(new Buch("Animal Farm", "George Orwell", 12.0, 112));
        buecher.add(new Buch("Java Basics", "Max Müller", 35.0, 520));
        buecher.add(new Buch("The Hobbit", "J. R. R. Tolkien", 28.0, 310));

        Bibliothek bibliothek = new Bibliothek(buecher);

        // Apelăm metodele și printăm direct rezultatele
        System.out.println("1. Orwell: " + bibliothek.buecherVonAutor("George Orwell"));

        System.out.println("2. Media pagini: " + bibliothek.durchschnittSeiten(buecher));

        System.out.println("3. Sub 30 Euro: " + bibliothek.maxPreis(buecher, 30.0));

        System.out.println("4. Cea mai scumpă: " + bibliothek.teuersteBuch(buecher));

        System.out.println("5. Minim 300 pagini: " + bibliothek.mindestanzahlVonSeiten(buecher, 300));

        System.out.println("6. Buget 55 Euro: " + bibliothek.zweiBuecherInnerhalbEinesBudgets(buecher, 55.0));
    }
}