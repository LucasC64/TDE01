import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho da Lista A:");
        int tamanhoA = teclado.nextInt();

        System.out.println("Digite o tamanho da Lista B:");
        int tamanhoB = teclado.nextInt();

        Merge merge = new Merge(tamanhoA, tamanhoB);

        int i = 0;

        while (i < tamanhoA){
            i++;
            System.out.println("Digite o valor para lista A (posição " + i + ") :" );
            int valor = teclado.nextInt();
            merge.insereA(valor);

        }

        i = 0;

        while (i < tamanhoB){
            i++;
            System.out.println("Digite o valor para lista B (posição " + i + ") :" );
            int valor = teclado.nextInt();
            merge.insereB(valor);
        }

        merge.imprime();

        merge.merge();
    }
}