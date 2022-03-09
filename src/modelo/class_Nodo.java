package modelo;

public class class_Nodo {
    int dato;
    int nombre;
    class_Nodo hDer, hIz;
    public class_Nodo(int D, int name){
        this.dato = D;
        this.nombre = name;
        this.hIz = null;
        this.hDer = null;
    }
    
}
