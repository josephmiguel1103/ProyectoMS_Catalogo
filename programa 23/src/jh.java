import java.sql.SQLOutput;
import java.util.Scanner;
public class jh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int indice;
        int valor = 0;

        do {
            System.out.print("¿EN QUE INDICE DEL ARRAY DESEAS INGRESAR UN NUMERO?: ");
            indice = sc.nextInt();

            if(indice!=1000){
                if (indice >=0 && indice<=9) {
                    System.out.print("¿QUE NUMERO DESEAS INGRESAR EN ESE INDICE?: ");
                    valor = sc.nextInt();
                    numeros[indice] = valor;
                }else {
                    System.out.println("ESE INDICE NO EXISTE");
                }
            }

        }while (indice!=1000);
        System.out.println("------------------ESOS SON LOS VALORES QUE PUSISTE A CADA INDICE----------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("VALOR DE LA SELDA "+i+" :  "+numeros[i]);
        }





    }
}
