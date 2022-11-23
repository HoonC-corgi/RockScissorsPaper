import java.util.Scanner;

public class Player {
    private String name;
    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int turn() {
        while(true) {
            System.out.println(name + "[가위(1), 바위(2), 보(3), 끝내기(4)] : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input >=1 && input <=4) {
                return input;
            }
            else {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }
}
