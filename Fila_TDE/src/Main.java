import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        Fila fila = new Fila();


        boolean verificador = true;

        while (verificador == true){
            System.out.println("O que deseja fazer? (inserir/remover/exibir/sair) ");
            String resposta = teclado.nextLine();
            if(resposta.equalsIgnoreCase("inserir")){
                System.out.println("Digite o valor que você deseja inserir");
                int valor = teclado.nextInt();
                teclado.nextLine();
                fila.insere(valor);
            }else if (resposta.equalsIgnoreCase("remover")) {
                System.out.println("O valor removido foi: " + fila.remove().getValor() );
            }else if(resposta.equalsIgnoreCase("exibir")){
                System.out.println("O valores na fila são: ");
                fila.imprime();
            }else if(resposta.equalsIgnoreCase("sair")){
                verificador = false;
            }
        }

    }
}