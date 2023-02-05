public class App {
    public static void main(String[] args) {
        int[] index = new int[530];

        int startIndex = 428;
        while (startIndex < index.length) {
            if (startIndex % 5 == 0 & startIndex % 3 == 0) {
                System.out.print(startIndex + "TikTak\t");

            } else if (startIndex % 5 == 0) {
                System.out.print(startIndex + "Tak\t");
            } else if (startIndex % 3 == 0) {
                System.out.print(startIndex + "Tik\t");
            }
            startIndex = startIndex + 1;
        }
    }
}