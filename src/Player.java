public class Player {

    private int playerId;
    private String name;
    private int age;
    private double score;

    // Konstruktør
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Viser spillerens detaljer
    public void displayDetails() {
        System.out.println("Spiller ID: " + playerId);
        System.out.println("Navn: " + name);
        System.out.println("Alder: " + age);
        System.out.println("Score: " + score);
    }

    // Opdaterer spillerens score
    public void updateScore(double newScore) {
        this.score = newScore;
    }
}