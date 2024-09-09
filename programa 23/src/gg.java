import java.util.Scanner;
public class gg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print(" INGRESA EL NOMBRE : ");
            nombres[i] = sc.nextLine();
        }
        System.out.println("-------------LISTA DE NOMBRES INGRESADOS------------");
        for (int i = 0; i <= 9; i++) {
            System.out.println(nombres[i]);

        }
    }
}
