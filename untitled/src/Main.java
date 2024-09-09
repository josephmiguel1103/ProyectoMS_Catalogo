import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random ALEATORIO=new Random();


        int n;
        int x=777;
        int vueltas=0;



        do {

            n = ALEATORIO.nextInt(1001   -1) + 1;
            System.out.println(n);
            vueltas++;


        }  while ( n!=x);
            System.out.println("se a encotrado en la vuelta  "+vueltas+ " :");




    }

}