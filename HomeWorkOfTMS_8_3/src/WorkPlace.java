public class WorkPlace {
    private int[][] place = new int[3][3];

    public WorkPlace() { }

    public void showPlace () {
        System.out.println("  1 2 3");
        for (int i = 0; i < place.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < place[i].length; j++) {

                if ( place[i][j] == 1 ) {
                    System.out.print("X ");
                } else  if ( place[i][j] == 2 ) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkPlace ( int [] values, int index ) {
        boolean answer = false;
        int counterGeneralLine = 0;
        int counterUnGeneralLine = 0;
        int[] counterColumn = {0, 0, 0};

        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[i].length; j++) {
                if (i == values[0] - 1 && j == values[1] - 1) {
                    place[i][j] = index;
                }
            }
        }

        showPlace();

        body:
        {
            for (int i = 0; i < place.length; i++) {
                int counterRow = 0;

                for (int j = 0; j < place[i].length; j++) {
                    if (i == j && place[i][j] == index) {
                        counterGeneralLine++;
                    }
                    if (place[i].length - 1 - i == j && place[i][j] == index) {
                        counterUnGeneralLine++;
                    }
                    if (place[i][j] == index) {
                        counterRow++;
                        counterColumn[j]++;
                    }
                }

                if (counterRow == place[i].length) {
                    answer = true;
                    break body;
                }
            }

            if (counterGeneralLine == place.length || counterUnGeneralLine == place.length) {
                answer = true;
                break body;
            }

            for (int i : counterColumn) {
                if (i == 3) {
                    answer = true;
                    break body;
                }
            }
        }

        return answer;
    }
}
