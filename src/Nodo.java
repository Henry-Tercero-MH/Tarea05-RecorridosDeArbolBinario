public class Nodo {
    int valor;//declaro una variable llamada valor
    Nodo izquierdo,derecho;

    /*
    Cree un metodo constructor con parametro el cual me pide un parametro llamado item
    luego a valor le asignamos esa variable
    */
public Nodo(int item){
    valor = item;
    izquierdo = derecho = null;
}
}
