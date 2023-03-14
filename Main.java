import javax.tools.SimpleJavaFileObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int input = Integer.parseInt(scn.next());
        for (int i=input; i>0; i--){
            for (int j=i; j<input+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=input; i>0; i--) {
            for (int k=i; k>0; k--){
                System.out.print(" ");
            }
            for (int j = i; j < input + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
