import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int choice = 0;
        Library library = new Library();
        Scanner scanIn = new Scanner(System.in);

        do {
            System.out.println (".:     LIBRARY    :.");
            System.out.println("1- Inserisci scaffale");
            System.out.println("2- Inserisci libro");
            System.out.println("3- Stampa lista dei libri");
            System.out.println("4- Stampa lista libri dato un autore");
            System.out.println("5- Cerca posizione libro");
            System.out.println("0- ESCI");

            choice = scanIn.nextInt();
            System.out.println (" ");

            if (choice < 0 || choice > 5)
                System.out.println ("ERRORE");

            switch (choice) {
                case 1:
                    System.out.println("Inserisci id");
                    int id = scanIn.nextInt();
                    System.out.println("Inserici numero scaffale");
                    int number = scanIn.nextInt();
                    library.addShelf(id, number);
                    break;
                case 2:
                    System.out.println("Inserisci ID libro");
                    int idBook = scanIn.nextInt();
                    System.out.println("Inserisci titolo del libro");
                    String titleBook = scanIn.next();
                    System.out.println("Inserisci autore del libro");
                    String authorBook = scanIn.next();
                    System.out.println("Inserisci prezzo: ");
                    double priceBook = scanIn.nextDouble();
                    System.out.println("Inserisci posizione");
                    int positionBook = scanIn.nextInt();
                    Publication publication = new Publication(titleBook, authorBook, priceBook);
                    System.out.println (library.newBook(idBook, publication, positionBook));
                    break;
                case 3:
                    library.printList();
                    break;
                case 4:
                    System.out.println("Inserisci autore");
                    String author = scanIn.next();
                    library.searchForAuthor(author);
                    break;
                case 5:
                    library.checkPosition();
                    break;
            }
        }
        while (choice != 0);
    }
}
