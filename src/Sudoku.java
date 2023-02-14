public class Sudoku {
    public static void main(String[] args) {

        // ustawienie wartości sudoku
        int x = 0;
        int[][] sudoku = {{1, x, 3}, {x, 1, 2}, {2, 3, x}};

        // obliczanie brakujących elementów
        int rowIndex = 0;
        while (rowIndex < sudoku.length) {
            int n = 6 - (sudoku[rowIndex][0] + sudoku[rowIndex][1] + sudoku[rowIndex][2]);  // 6 to suma wartości wszystkich elementów każdego wiersza
            int colIndex = 0;
            while (colIndex < sudoku[rowIndex].length) {
                if (sudoku[rowIndex][colIndex] == 0) {
                    sudoku[rowIndex][colIndex] = n;
                }
                colIndex++;
            }
            rowIndex++;
        }

        // wyświetlenie uzupełnionego sudoku
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

