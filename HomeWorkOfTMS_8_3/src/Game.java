public class Game {
    private int [][] cache = new int[9][2]; // row/column
    private int gameCounter = 0;
    private boolean somebodyWin = false;

    private Player player1 = new Player(1);
    private Player player2 = new Player(2);
    private WorkPlace place = new WorkPlace();

    public Game () {
        System.out.println("Перед вами игра крестики-нолики. Ваша задача заполнять рабочее поле 3х3 поочереди.");
        System.out.println("Первый игрок играет за \"Х\" , второй за \"0\"");
        System.out.println("чтобы вписать свое значение в игравое поле, " +
                "нужно указать номер строки а затем номер колонки для своего значения во время хода.");
        System.out.println("Нумерация начинаятся c левого верхнего угла поля");
        System.out.println("Удачи!!!)");

        place.showPlace();
    }



    public void playGame () {
        do {
            int []values;

            if ( gameCounter % 2 == 0 ) {
                values = checkStep(player1);
                somebodyWin = place.checkPlace(values, player1.getNumberOfPlayer());
            } else {
                values = checkStep(player2);
                somebodyWin = place.checkPlace(values, player2.getNumberOfPlayer());
            }

        } while ( !(somebodyWin) && ++gameCounter < 9 );

    }

    private int [] checkStep (Player player) {
        int[] values;
        System.out.println();
        System.out.println("Игрок № " + player.getNumberOfPlayer() + "делает ход...");

        body:
        while (true) {
            values = player.input();

            for (int[] array : cache) {
                if (values[0] == array[0] && values[1] == array[1]) {
                    System.out.println("Эта ячейка уже заполнена! Введите другие координаты.");
                    continue body;
                }
            }
            break;
        }

        cache[gameCounter] = values;
        return values;
    }



    public void finishGame () {
        System.out.println("И так, игра закончена!!!");
        if ( !somebodyWin ) {
            System.out.println("К сожалению у нас ничья...Не хотите ли сыграть еще раз?");
            return;
        }

        System.out.print("У нас есть победитель им стал.....: ");
        if ( gameCounter % 2 == 0 ) {
            System.out.print("игрок № " + player1.getNumberOfPlayer() + " за " + player1.getCounterAnswers() + " хода");
        } else {
            System.out.print("игрок № " + player2.getNumberOfPlayer() + " за " + player2.getCounterAnswers() + " хода");
        }
    }
}
