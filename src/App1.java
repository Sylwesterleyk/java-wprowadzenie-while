public class App1 {
    public static void main(String[] args) {
        int n = 10;
        int x = 0;
        char star = '*';

        while (x < n) {
            int y = -1;
            while (y < x) {
                System.out.print(star);
                y++;
            }
            x++;
            System.out.println();
        }
    }
}