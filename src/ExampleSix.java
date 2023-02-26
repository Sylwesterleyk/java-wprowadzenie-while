public class ExampleSix {
    public static void main(String[] args) {

        // wartości sudoku
        int x = 0;
        int[][] sudoku = {{2, x, x}, {x, x, 2}, {1, 2, x}};

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

        // obliczanie ile jest niewiadomych liczb
        int pustePola = 0;
        rowIndex = 0;
        while (rowIndex < sudoku.length) {
            int colIndex = 0;
            while (colIndex < sudoku.length) {
                if (sudoku[rowIndex][colIndex] == 0) {
                    pustePola++;
                }
                colIndex++;
            }
            rowIndex++;
        }
        // wykonywanie obliczeń w pętli tak długo, jak istnieją nieobliczone pole
        while (pustePola > 0) {
            // obliczenie brakującej cyfry oraz zapamiętanie jej indeksu W WIERSZU
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
                // obliczanie pod warunkiem, że niewiadoma jest jedna
                if (zera == 1) {
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
                    pustePola--;

                }
                rowIndex++;
            }

            // obliczanie brakującej cyfry oraz zapamietanie jej indeksu W KOLUMNIE
            int colIndex = 0;
            while (colIndex < sudoku.length) {
                int zera = 0;
                rowIndex = 0;
                while (rowIndex < sudoku.length) {
                    if (sudoku[rowIndex][colIndex] == 0) {
                        zera++;
                    }
                    rowIndex++;
                }
                // obliczanie pod warunkiem, że niewiadoma jest jedna
                if (zera == 1) {
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
                    pustePola--;

                }
                colIndex++;
            }
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




