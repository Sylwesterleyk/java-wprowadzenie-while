public class SudokuAuto {
    public static void main(String[] args) {

        // wartości sudoku
        int x = 0;
        int[][] sudoku = {{1, x, 3, 2}, {4, x, 2, 3}, {x, 3, 4, 1}, {3, x, 1, 4}};

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

        //wyznaczenie ile wynosi 'sum' na podstawie długości tablicy
        int sum = sudoku.length;
        int z = 1;
        while ((sudoku.length - z) > 0) {
            sum += sudoku.length - z;
            z++;
        }

        // obliczenie brakującej cyfry oraz zapamiętanie jej indeksu
        rowIndex = 0;
        while (rowIndex < sudoku.length) {
            int colIndex = 0;
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
                rowIndex++;
            }

            // wyświetlenie sudoku z podstawionymi niewiadomymi

            System.out.println("Uzupełnione sudoku:");
            rowIndex = 0;
            while (rowIndex < sudoku.length) {
                int colIndex = 0;
                while (colIndex < sudoku[rowIndex].length) {
                    System.out.print(sudoku[rowIndex][colIndex] + " ");
                    colIndex++;
                }
                rowIndex++;
                System.out.println();
            }
        }
    }



