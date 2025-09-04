public class Merge {
    private int tamanhoA;
    private int tamanhoB;
    private int tamanhoC;
    private int indiceA;
    private int indiceB;
    private int listaA[];
    private int listaB[];
    private int listaC[];

    public Merge(int tamanhoA, int tamanhoB ) {
        this.tamanhoA = tamanhoA;
        this.tamanhoB = tamanhoB;
        this.tamanhoC = tamanhoA + tamanhoB;
        this.indiceA = -1;
        this.indiceB = -1;
        this.listaA = new int[tamanhoA];
        this.listaB = new int[tamanhoB];
        this.listaC = new int[tamanhoC];
    }

        public void insereA (int valor) {
            if (tamanhoA - 1 > indiceA) {
                indiceA += 1;
                listaA[indiceA] = valor;
            }
        }


        public void insereB (int valor) {
            if (tamanhoB - 1 > indiceB) {
                indiceB += 1;
                listaB[indiceB] = valor;
            }

        }

        public void imprime(){
        System.out.println("");
        System.out.println("A lista A será: ");
            for(int i = 0; i < tamanhoA; i++){
                if(listaA[i] != 0) {
                    System.out.println(listaA[i]);
                }
            }
            System.out.println("");
            System.out.println("A lista B será: ");
            for(int i = 0; i < tamanhoB; i++){
                if(listaB[i] != 0) {
                    System.out.println(listaB[i]);
                }
            }



    }

    public void merge(){

        int k = 0;

        for(int i = 0; i < tamanhoA; i++){
            listaC[k] = listaA[i];
            k++;
        }

        for(int j = 0; j < tamanhoB; j++){
            listaC[k] = listaB[j];
            k++;
        }

        int aux = 0;
        for(int x = 0; x<tamanhoC; x++){
            for(int y = 0; y<tamanhoC - 1; y++){
                if(listaC[y] > listaC[y + 1]){
                    aux = listaC[y];
                    listaC[y] = listaC[y+1];
                    listaC[y+1] = aux;
                }
            }
        }

        System.out.println("");
        System.out.println("A lista C será: ");
        for(int z = 0; z < tamanhoC; z++){
            if(listaC[z] != 0) {
                System.out.println(listaC[z]);
            }
        }

    }

}
