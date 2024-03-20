//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ArbolBinario arbolBinario = new ArbolBinario();
arbolBinario.raiz = new Nodo(10);
arbolBinario.raiz.izquierdo = new Nodo(12);
arbolBinario.raiz.derecho = new Nodo(5);
arbolBinario.raiz.izquierdo.izquierdo = new Nodo(3);
        arbolBinario.raiz.izquierdo.derecho = new Nodo(4);
        arbolBinario.raiz.derecho.izquierdo = new Nodo(11);
        arbolBinario.raiz.derecho.derecho = new Nodo(2);
        arbolBinario.raiz.izquierdo.derecho.izquierdo = new Nodo(6);
        arbolBinario.raiz.izquierdo.derecho.derecho = new Nodo(7);
        arbolBinario.raiz.derecho.derecho.derecho = new Nodo(8);

        System.out.println("Recorrido En Orden");
        arbolBinario.recorridoEnOrden(arbolBinario.raiz);
        System.out.println("");
        System.out.println("Recorrido Pre Orden");
        arbolBinario.recorridoPreOrden(arbolBinario.raiz);
        System.out.println("");
        System.out.println("Recorrido Post Orden");
        arbolBinario.recorridoPostOrden(arbolBinario.raiz);
    }
}