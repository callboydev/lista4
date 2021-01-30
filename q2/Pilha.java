public class Pilha {
    public String[] pilha;
    public int posicao_pilha;
    public int quantidade_paginas;
    public int tamanho = 100;
    public Pilha() {
        this.posicao_pilha = -1;
        this.pilha = new String[tamanho];
    }   
    public boolean vazia() {
        if (this.posicao_pilha == -1) {
            return true;
        }
        return false;
    }    
    public int tamanho() {
        if (this.vazia()) {
            return 0;
        }
        return this.posicao_pilha + 1;
    }   
    public void empilhar(String pagina) {
        if (this.posicao_pilha < this.pilha.length - 1) {
            this.quantidade_paginas++;
            this.pilha[++this.posicao_pilha] = pagina;
        }
    }  
    public void desempilhar() {
        if(vazia()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Voltando da página " + atual());
            this.posicao_pilha--;
            System.out.println("Para a pagina " + atual());
        }
        
    }
    public String atual() {
        if(!vazia()) {
            return this.pilha[this.posicao_pilha];
        }
        return "Página em branco";
    } 
    public void proxima() {
        if(!vazia()) {
            if(this.posicao_pilha+1 < this.quantidade_paginas ) {
                System.out.println("Avançando da página " + atual());
                this.posicao_pilha++;
                System.out.println("Para da página " + atual());
            } else {
                System.out.println("Sem proxima");
            }
        } else {
            System.out.println("Pilha vazia");
        }
    }
}
