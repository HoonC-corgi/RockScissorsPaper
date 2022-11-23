public class RSP {
    private final String s [] = {"가위", "바위", "보"};
    private Player [] players = new Player[2];

    public RSP() {
        players[0] = new Player("철수");
        players[1] = new Computer("컴퓨터");
    }
}