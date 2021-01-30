import java.util.Scanner;
public class TesteFila {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Fila fila_banco = new Fila();
        while(true) {
            System.out.println("Por favor, escolha uma das opções:\n1 para incluir um cliente na fila;\n2 para atender o próximo cliente;\n3 para consultar o próximo cliente da fila; ou\n4 para consultar quantos clientes existem na fila.");
            int opcao = teclado.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("nome: ");
                    String nome = teclado.next();
                    fila_banco.incluir(nome);
                break;
                case 2:
                    fila_banco.remover();
                break;
                case 3:
                    fila_banco.proximo();
                break;
                case 4:
                    fila_banco.quantidade();
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }
    }
}
