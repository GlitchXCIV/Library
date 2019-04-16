public class Shelf {
    private Publication[] publications;
    private Publication publicationis;
    private int numberOfPublications;
    private int position;
    private String titleOfBook;
    private int id;

    public Shelf(int id, int numberOfPublications) {
        this.publications = new Publication[numberOfPublications];
        for (int i = 0; i < numberOfPublications; i++) {
            publications = null;
        }
    }

    public Publication getPublications(int position) {
        if (this.publications[position] != null) {
            return publications[position];
        } else {
            return null;
        }
    }

    public void setPublications(Publication publicationis, int position) {
        if (this.publications[position] != null) {
            this.publications[position] = null;
        } else {
            this.publications[position] = publicationis;
        }
    }

    public int search(String titleOfBook) {
        int array = -1;
        for (int i = 0; i < numberOfPublications; i++) {
            if (publications[i].getTitle().equalsIgnoreCase(titleOfBook)) {
                array = i;
            }
        }
        return array;
    }

    public void list() {
        for (int i = 0; i < numberOfPublications; i++) {
            System.out.println(publications[i].toString());
        }
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }
}