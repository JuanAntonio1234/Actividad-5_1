import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class asdf {
    public static void print(String parametro1) {
        System.out.println(parametro1);
    }
    
    public static int metodo2(int parametro1) {
        if (parametro1 == 0) {
            return 1;
        } else {
            int variable1 = 1;
            int variable2 = parametro1;
            do {
                variable1 *= variable2;
                variable2--;
            } while (variable2 > 0);
            return variable1;
        }
    }
    
    public static String metodo3(String parametro1) {
        String variable1 = "";
        int variable2 = 0;
        do {
            variable1 = parametro1.charAt(variable2) + variable1;
            variable2++;
        } while (variable2 < parametro1.length());
        variable1 = parametro1 + variable1;
        return variable1;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner variable1 = new Scanner(System.in);
        int variable2;
        do {
            print("BIENVENIDO AL PROGRAMA OFUSCADO");
            print("-------------------------------");
            print("Elija una opcion:");
            print("1) ADIVINA QUÉ HACE");
            print("2) ADIVINA QUÉ HACE");
            print("3) ADIVINA QUÉ HACE");
            print(">");
            String variable3 = variable1.readLine();
            variable2 = Integer.parseInt(variable3);
            if (variable2 == 1) {
                print("Inserte un número:");
                String variable4 = variable1.readLine();
                int variable5 = Integer.parseInt(variable4);
                int variable6 = metodo2(variable5);
                print("El resultado es:");
                print("" + variable6);
            } else {
                if (variable2 == 2) {
                    print("Inserte una palabra:");
                    String variable7 = variable1.readLine();
                    String variable8 = metodo3(variable7);
                    print("El resultado es:");
                    print(variable8);
                }
            }
        } while (variable2 != 3);
    }
}