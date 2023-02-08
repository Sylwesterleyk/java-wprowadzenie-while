public class Cone {
    public static void main(String[] args) {

        double podstawa = 9;  //liczba n
        double gwiazdka = 1;

        while (podstawa > 0) {

            double spacja = podstawa / 2;
            while (spacja > 1) {
                System.out.print(" ");
                spacja--;
            }
            double x = gwiazdka;
            while (x > 0) {
                System.out.print("*");
                x--;
            }
            System.out.println("");
            podstawa -= 2;
            gwiazdka += 2;
        }

    }

}

