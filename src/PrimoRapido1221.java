import java.io.IOException;
import java.util.Scanner;

public class PrimoRapido1221 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int qntNumber = sc.nextInt();

        String result = "";

        for(int n = 0; n<qntNumber; n++){
            int number = sc.nextInt();
            if(isPrime(number)){
                result += "Prime\n";
            }else{
                result += "Not Prime\n";
            }

        }

        System.out.println(result);

    }

    public  static boolean isPrime(int number){
        int num = (int) Math.sqrt(number)+ 1;
        for(int i = 2; i< num; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

}
