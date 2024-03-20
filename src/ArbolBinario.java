public class ArbolBinario {
    Nodo raiz;//instancie la clase nodo

    public ArbolBinario() {//metodo constructor sin parametros
    }


    //metodo constructor con parametros
    ArbolBinario(int valor){//creamos un constructor de tipo arbol y pedimos un parametro llamado valor
        raiz = new Nodo(valor);//creamos un nuevo nodo y le asignamos  la variable valor como raiz del arbol
    }

    public void recorridoEnOrden(Nodo nodo){
        //algoritmo para recorrer los elementos del arbol en Orden
        //In <left> root <right>
        if(nodo !=null){//si el nodo esta vacio entoces va recorrer primero todos los nodos izquierdo
            recorridoEnOrden(nodo.izquierdo);//en este algoritmo se usa la recursividad
            System.out.print(nodo.valor+"-");//va a imprimir la posicion actual  y luego
            recorridoEnOrden(nodo.derecho);//va a recorrer todos los nodos derecho de cada subarbol

        }
    }
    public void recorridoPreOrden(Nodo nodo){
        //algoritmo para recorrer los elementos en Pre-Orden
        //Pre root <left> <right>
        if(nodo !=null){
            System.out.print(nodo.valor+"-");
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);

        }
    }
    public void recorridoPostOrden(Nodo nodo){
        //algoritmo para recorrer los elementos del nodo en Post-Orden
        //Post <left> <right> root
        if(nodo !=null){
            recorridoPostOrden(nodo.izquierdo);
            recorridoPostOrden(nodo.derecho);
            System.out.print(nodo.valor+"-");
        }
    }

}
