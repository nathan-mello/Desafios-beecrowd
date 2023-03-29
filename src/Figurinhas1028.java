import java.io.IOException;
import java.util.Scanner;

public class Figurinhas1028 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int qntNumber = sc.nextInt();
        String result = "";
        int number1;
        int number2;

        for(int n = 0; n<qntNumber; n++){
            number1 = sc.nextInt();
            number2 = sc.nextInt();

            if(number2<number1){
                result += mdc(number1, number2);
            }else{
                result += mdc(number2, number1);
            }

        }

        System.out.print(result);

    }

    public static String mdc(int number1, int number2){
        if(number2==0){
            return number1 + "\n";
        }else{
            return mdc(number2, number1%number2);
        }

    }

}