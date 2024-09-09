import java.util.Scanner;
public class TransporteRayo {
    public static void main(String[]args){
        Scanner gogo=new Scanner(System.in);
        System.out.println("Bienvenido ala empresa de transportes rayo");
        int edad=gogo.nextInt();
        if(edad>=5&&edad<=64) {
            System.out.println("seleccione su paradero");
            System.out.println("opcion 1: puno");
            System.out.println("opcion 2: arequipa");
            System.out.println(" opcion 3: lima");
            int paradero = gogo.nextInt();
            switch (paradero) {
                case 1: // puno
                    System.out.println("selecione su destino");
                    System.out.println("opcion 1: lima");
                    System.out.println("opcion 2: arequipa");
                    int destino = gogo.nextInt();
                    switch (destino) {
                        case 1:
                            System.out.println("¿Cuantos pasajes comprará?");
                            int cantPasajeslima = gogo.nextInt();
                            double pasajelima = 200.00;
                            double totalPagarLima = pasajelima * cantPasajeslima;
                            System.out.println("El total a pagar es: " + totalPagarLima);
                            break;
                        case 2:
                            System.out.println("¿Cuantos pasajes comprará?");
                            int cantPasajesarequipa = gogo.nextInt();
                            double pasajearequipa = 40.00;
                            double totalPagararequipa = pasajearequipa * cantPasajesarequipa;
                            System.out.println("El total a pagar es: " + totalPagararequipa);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 2: //arequipa
                    System.out.println("seleccione su dstino");
                    System.out.println("opcion 1: lima ");
                    System.out.println("opcion 2: puno ");
                    int destino = gogo.nextInt();
                    switch (destino) {
                        case 1:
                            System.out.println("¿cuantos pasajes comprara");
                            int cantPasajeslima = gogo.nextInt();
                            double pasajelima = 150.00;
                            double totalPagarlima = pasajelima * cantPasajeslima;
                            System.out.println("El total a pagar es: " + totalPagarlima);
                            break;
                        case 2:
                            System.out.println("¿Cuantos pasajes comprará?");
                            int cantPasajesPuno = gogo.nextInt();
                            double pasajePuno = 40.00;
                            double totalPagarPuno = pasajePuno * cantPasajesPuno;
                            System.out.println("El total a pagar es: " + totalPagarPuno);
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 3: // lima
                    System.out.println("seleccione su dstino");
                    System.out.println("opcion 1: arequipa ");
                    System.out.println("opcion 2: puno ");
                    int destino = gogo.nextInt();
                    switch (destino) {
                        case 1:
                            System.out.println("¿cuantos pasajes comprara");
                            int cantPasajesarequipa = gogo.nextInt();
                            double pasajearequipa = 150.00;
                            double totalPagararequipa = pasajearequipa * cantPasajesarequipa;
                            System.out.println("El total a pagar es: " + totalPagararequipa);
                            break;
                        case 2:
                            System.out.println("¿Cuantos pasajes comprará?");
                            int cantPasajesPuno = gogo.nextInt();
                            double pasajePuno = 200.00;
                            double totalPagarPuno = pasajePuno * cantPasajesPuno;
                            System.out.println("El total a pagar es: " + totalPagarPuno);
                            break;
                        default:
                            System.out.println("opcion no valida");

                    }


            }
            else if((edad>=65&&edad<=100){

            }
            else{
                System.out.println("opcion no valida");
            }

            }









    }

}
