import java.util.LinkedList;
public class Pilha {
    public LinkedList pilha;
    public Pilha() {
        this.pilha = new LinkedList();
    }
    public void push(int n) {
    	this.pilha.addFirst(n);
    }
}