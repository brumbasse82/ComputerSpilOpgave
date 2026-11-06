public class GameSystem {

    private Game[] games;
    private Player[] players;

    private int gameCount;
    private int playerCount;

    // Konstruktør
    public GameSystem() {
        games = new Game[100];
        players = new Player[100];

        gameCount = 0;
        playerCount = 0;
    }

    // Tilføjer et spil
    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Spilbiblioteket er fuldt!");
        }
    }

    // Tilføjer en spiller
    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Der er ikke plads til flere spillere!");
        }
    }

    // Viser alle spil
    public void displayAllGames() {
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
            System.out.println("----------------");
        }
    }

    // Viser alle spillere
    public void displayAllPlayers() {
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
            System.out.println("----------------");
        }
    }

    // Finder en spiller ud fra ID
    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i];
            }
        }

        return null;
    }

    // Finder et spil ud fra ID
    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameId) {
                return games[i];
            }
        }

        return null;
    }

    // Opdaterer en spillers score
    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);

        if (player != null) {
            player.updateScore(newScore);
            System.out.println("Score opdateret!");
        } else {
            System.out.println("Spilleren blev ikke fundet!");
        }
    }
}