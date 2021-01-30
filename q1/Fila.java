public class Fila {
    public int inicio;
    public int fim;
    public int quantidade_elementos;
    public String fila[];
    public int tamanho = 100;
    public Fila() {
        this.inicio = 0;
        this.fim = -1;
        this.fila = new String[this.tamanho];
        this.quantidade_elementos = 0;
    }
    public boolean completa(){
        if (this.quantidade_elementos == this.tamanho - 1){
            return true;
        }
        return false;
    }
    public void incluir(String cliente){
        if (!this.completa()){
            if (this.inicio == -1){
                this.inicio = 0;
            }
            this.fim++;
            this.fila[this.fim] = cliente;
            this.quantidade_elementos++;
            System.out.println("Cliente incluido");
        }
    }
    public boolean vazia(){
        if (this.quantidade_elementos == 0){
            return true;
        }
        return false;
    }
    public void remover(){
        if (!vazia() ){
            System.out.println("Cliente " + this.fila[this.inicio] + " atendido");
            this.inicio++;
            this.quantidade_elementos--;
        } else {
            System.out.println("Não há clientes na fila");
        }
    }
    public void proximo() {
        if(!vazia()) {
            System.out.println("Cliente " + this.fila[this.inicio] + " é o próximo da fila");
        } else {
            System.out.println("Não há clientes na fila");
        }
    }
    public void quantidade() {
        System.out.println(this.quantidade_elementos + " clientes aguardando na fila");
    }
}
    
