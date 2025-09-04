public class Fila {
    private Node primeiro;

    public Fila(){
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
            Node novoNode = new Node(valor);
            ponteiro.setProximoNode(novoNode);

        }
    }

    public Node remove(){
        if(estaVazio()){
            System.out.println("Está vazio");
            return null;
        }else{
            Node ponteiro = primeiro;
            primeiro = primeiro.getProximoNode();
            return ponteiro;
        }
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
