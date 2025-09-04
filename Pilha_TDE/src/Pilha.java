public class Pilha {
    private Node primeiro;

    public Pilha(){
        this.primeiro = null;
    }
    public boolean estaVazio() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    public void insere(int valor) {
        if (estaVazio()) {
            Node nodePrimeiro = new Node(valor);
            nodePrimeiro.setProximoNode(primeiro);
            primeiro = nodePrimeiro;
        } else {
            Node ponteiro = primeiro;
            while (ponteiro.getProximoNode() != null) {
                ponteiro = ponteiro.getProximoNode();
            }
            Node novoLaço = new Node(valor);
            ponteiro.setProximoNode(novoLaço);

        }
    }

    public Node remove(){
        Node ultimo = null;
        Node penultimo = null;
        Node ponteiro = primeiro;
        while (ponteiro != null){
            penultimo = ultimo;
            ultimo = ponteiro;
            ponteiro = ponteiro.getProximoNode();

        }

        penultimo.setProximoNode(null);
        return ultimo;
    }

    public void imprime(){
        if (estaVazio()){
            System.out.println("A lista está vazia");
        }else{
            Node ponteiro = primeiro;
            while (ponteiro != null){
                System.out.println(ponteiro.getValor());
                ponteiro = ponteiro.getProximoNode();
            }

        }
    }

}
