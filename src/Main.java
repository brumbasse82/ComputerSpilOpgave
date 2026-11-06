public class Main {
    public static void main(String[] args) {

        GameSystem system = new GameSystem();

        system.addGame(new Game(1, "Minecraft", "Sandbox", 199));
        system.addPlayer(new Player(1, "Lucas", 20, 500));
        system.addPlayer(new Player(2, "Kevin", 20, 300));
        system.updatePlayerScore(2, 450);

        system.displayAllGames();
        system.displayAllPlayers();
    }
}