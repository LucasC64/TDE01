public class Node {
    private int valor;
    private Node proximoNode;

    public Node(int valor) {
        this.valor = valor;
        this.proximoNode = null;
    }

    public int getValor(){
        return valor;
    }

    public void setProximoNode(Node proximo){
        this.proximoNode = proximo;
    }

    public Node getProximoNode(){
        return proximoNode;
    }

}
