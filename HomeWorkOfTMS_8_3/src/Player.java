import java.util.Scanner;

public class Player {
    private int counterAnswers = 0;
    private int numberOfPlayer;
    private Scanner scanner = new Scanner(System.in);

    public Player(int numberOfPlayer) { this.numberOfPlayer = numberOfPlayer; }
    public Player() { }

    public int getNumberOfPlayer () {
        return numberOfPlayer;
    }
    public int getCounterAnswers () {
        return counterAnswers;
    }

    public int [] input() {
        int [] values = new int[2]; // row/column

        values[0] = getInput("Введите координату(номер) строки:");
        values[1] = getInput("Введите координату(номер) колонки:");

        counterAnswers++;
        return values;
    }

    private int getInput( String massage ) {
        System.out.println(massage);
        int value;

        while ( true ) {
            if ( !scanner.hasNextInt() ) continue;
            value = scanner.nextInt();
            if (  value > 0 && value < 4 ) break;
            System.out.println("Значение не корректно, попробуйте еще раз:");
        }

        return value;
    }


}
