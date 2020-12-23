public class Drama {

    private String name;
    private String genre;
    private String language;
    private int year;

    public Drama() {
        name = "";
        genre ="";
        language = "";
        year = 0;
    }

    public Drama(String n, String g, String l, int y) {
        name = n;
        genre = g;
        language = l;
        year = y;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGenre(String g) {
        genre = g;
    }

    public void setLanguage(String l) {
        language = l;
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

    public String getLanguage() {
        return this.language;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return name + "    |   " + genre + "   |   " + language + "    |   " + year;
    }

}
