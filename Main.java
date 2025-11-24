class Objeto{
    int elem;
    public Objeto(int x){
        this.elem = x;
    }
}

class Arvore{
    Objeto elem;
    Arvore dir, esq;

    public Arvore(){
        this.elem = null;
        this.dir = this.esq = null;
    }

    public void inserir(Objeto x){
        // implementar
    }

    public boolean search(int x){
        // implementar
    }
}

class Celula{
    Objeto elem;
    Celula prox;
    public Celula(Objeto x){
        this.elem = x;
        this.prox = null;
    }
}

class Lista{
    Celula primeira;
    Celula ultima;
    public Lista(){
        this.primeira = this.ultima = null;
    }
    public void inserirFim(Objeto x){
        // implementar
    }
    public boolean search(int x){
        // implementar
    }
}

class AVL{
    Objeto elem;
    AVL dir, esq;
    public AVL(){
        this.elem = null;
        this.dir = this.esq = null;
    }
    public void inserir(Objeto x){
        // implementar
    }
    public boolean search(int x){
        // implementar
    }
}

class Doidona{
    Objeto T1[];
    Objeto T3[];
    Arvore arvoreBinaria;
    Lista lista;
    AVL arvoreAVL;

    public Doidona(){
        this.T1 = new Objeto[6];
        this.T3 = new Objeto[5];
        this.arvoreBinaria = new Arvore();
        this.lista = new Lista();
        this.arvoreAVL = new AVL();
    }

    public void inserir(Objeto objeto){
        int elem = objeto.elem;
        int i = elem % 6; //hash da T1
        if(T1[i] == null){
            T1[i] = new Objeto(elem);
        }else{
            i = elem % 3; //hash da T2
            if(i == 0){ 
                i = elem % 5; //hash da T3
                if(T3[i] == null){
                    T3[i] = new Objeto(elem);
                } else {
                    i = elem - 1 % 5; //rehash da T3
                    if(T3[i] == null){
                        T3[i] = new Objeto(elem);
                    } else {
                        arvoreBinaria.inserir(objeto);
                    }
                }
            }else if (i == 1){
                lista.inserirFim(objeto);
            }else{ //if (i == 2)
                arvoreAVL.inserir(objeto);
            }
        }
    }

    public boolean search(int elem){
        int i = elem % 6; //hash da T1
        if(T1[i] == null){
            return false;
        } else if(T1[i].elem == elem){
            return true;
        } else {
            i = elem % 3; //hash da T2
            if(i == 0){
                i = elem % 5; //hash da T3
                if(T3[i] == null){
                    return false;
                } else if (T3[i].elem == elem){
                    return true;
                } else {
                    i = elem - 1 % 5; //rehash da T3
                    if(T3[i] == null){
                        return false;
                    } else if(T3[i].elem == elem){
                        return true;
                    }else {
                        arvoreBinaria.search(elem);
                    }
                }
            }else if (i == 1){
                lista.search(elem);
            }else{ //if (i == 2)
                arvoreAVL.search(elem);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Falta a implementação do main e dos métodos de inserir e procurar na arvore binaria, na lista e na AVL.");
    }
}


