public class Anime {

    private String name;
    private String genre;
    private int year;

    public Anime() {
        name = "";
        genre ="";
        year = 0;
    }

    public Anime(String n, String g, int y) {
        name = n;
        genre = g;
        year = y;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGenre(String g) {
        genre = g;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "Title: " + name + "\nGenre: " + genre + "\nYear: " + year;
    }

}
