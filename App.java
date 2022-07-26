
package calculoequaçãosegundograu;
import java.util.Scanner;
import java.lang.Math;
public class App {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("insira o valor de A:");
        Float valA = leitor.nextFloat();
        System.out.print("insira o valor de B:");
        Float valB = leitor.nextFloat();
        System.out.print("insira o valor de C:");
        Float valC = leitor.nextFloat();
        Float valDelta = (valB * valB) - 4 * valA * valC;
        System.out.println("o valor de Delta e:" + valDelta);
        if(valDelta > 0){
        double raizDelta = Math.sqrt(valDelta);
        double valX1 = (-(valB) + raizDelta)/ (2*valA);
        double valX2 = (-(valB) - raizDelta)/ (2*valA);
        System.out.println("o valor de X| e:" + valX1);
        System.out.println("o valor de X|| e:" + valX2);
        }else{
            System.out.println("Delta e negativo e por isso nao pode ser calculado");
        }
    }
}
