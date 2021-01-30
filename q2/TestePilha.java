import java.util.Scanner;
public class TestePilha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pilha paginas = new Pilha();
        while(true) {
            System.out.println("Por favor, escolha uma das opções:\n1 para navegar para outra página;\n2 para consultar qual a página atual;\n3 para voltar para a página anterior; ou\n4 para avançar para a próxima página.");
            int opcao = teclado.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("pagina: ");
                    String pagina = teclado.next();
                    paginas.empilhar(pagina);
                break;
                case 2:
                    System.out.println(paginas.atual());
                break;
                case 3:
                    paginas.desempilhar();
                break;
                case 4:
                    paginas.proxima();
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }
    }
}
