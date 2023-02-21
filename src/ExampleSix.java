public class ExampleSix {
    public static void main(String[] args) {

        // wartości sudoku
        int x = 0;
        int[][] sudoku = {{x, 3, x}, {x, 1, 2}, {1, 2, x}};

        // wyświetlenie sudoku
        System.out.println("Wprowadzone sudoku:");
        int rowIndex = 0;
        while (rowIndex < sudoku.length) {
            int colIndex = 0;
            while (colIndex < sudoku[rowIndex].length) {
                System.out.print(sudoku[rowIndex][colIndex] + " ");
                colIndex++;
            }
            rowIndex++;
            System.out.println();
        }

        // obliczanie ile wynosi sum
        int sum = 0, z = 0;
        while (z < sudoku.length) {
            sum += ++z;
        }


        // obliczenie brakującej cyfry oraz zapamiętanie jej indeksu (jeśli w wierszu jest jedna niewiadoma)
        rowIndex = 0;
        while (rowIndex < sudoku.length) {
            int zera = 0;
            int colIndex = 0;
            while (colIndex < sudoku.length) {
                if (sudoku[rowIndex][colIndex] == 0) {
                    zera++;
                }
                colIndex++;
            }
            if (zera < 2) {
                colIndex = 0;
                int emptyRowIndex = 0;
                int emptyColIndex = 0;
                int niewiadoma = sum;
                while (colIndex < sudoku[rowIndex].length) {
                    niewiadoma -= sudoku[rowIndex][colIndex];
                    if (sudoku[rowIndex][colIndex] == 0) {
                        emptyRowIndex = rowIndex;
                        emptyColIndex = colIndex;
                    }
                    colIndex++;
                }
                sudoku[emptyRowIndex][emptyColIndex] = niewiadoma;

            }
            rowIndex++;
        }

        // obliczanie brakującej cyfry oraz zapamietanie jej indeksu (w uzupełnieniu o nowe dane)
        int colIndex = 0;
        while (colIndex < sudoku.length) {
            if ((sudoku[0][colIndex] + sudoku[1][colIndex] + sudoku[2][colIndex]) < sum) {
                rowIndex = 0;
                int emptyRowIndex = 0;
                int emptyColIndex = 0;
                int niewiadoma = sum;
                while (rowIndex < sudoku.length) {
                    niewiadoma -= sudoku[rowIndex][colIndex];
                    if (sudoku[rowIndex][colIndex] == 0) {
                        emptyRowIndex = rowIndex;
                        emptyColIndex = colIndex;
                    }
                    rowIndex++;
                }
                sudoku[emptyRowIndex][emptyColIndex] = niewiadoma;

            }
            colIndex++;
        }


        // wyświetlenie sudoku z podstawionymi niewiadomymi
        System.out.println("Uzupełnione sudoku:");
        rowIndex = 0;
        while (rowIndex < sudoku.length) {
            colIndex = 0;
            while (colIndex < sudoku[rowIndex].length) {
                System.out.print(sudoku[rowIndex][colIndex] + " ");
                colIndex++;
            }
            rowIndex++;
            System.out.println();
        }
    }
}



