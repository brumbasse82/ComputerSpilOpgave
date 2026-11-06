public class Game {

    // Attributter
    private int gameId;
    private String title;
    private String genre;
    private double price;

    // Konstruktør
    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    // Getters
    public int getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Viser spillets detaljer
    public void displayDetails() {
        System.out.println("Spil ID: " + gameId);
        System.out.println("Titel: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Pris: " + price + " kr.");
    }
}