package modelo;

public class arbol_busqueda {
    class_Nodo raiz;
    String strrecorrido;
    public arbol_busqueda(){
        raiz=null;
    }
    
    public void agregarNodo (int d, int name){
        class_Nodo valor = new class_Nodo(d,name);
        if(raiz==null){
            raiz = valor;
        }
        else{
            class_Nodo auxiliar = raiz;
            class_Nodo padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hIz;
                    if(auxiliar == null){
                        padre.hIz=valor;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hDer;
                    if(auxiliar == null){
                        padre.hDer=valor;
                        return;
                    }}}}}
    
    public void INORDEN(class_Nodo r){
        if(r != null){
            INORDEN(r.hIz);
            System.out.println(r.dato);
            INORDEN(r.hDer);
        }
    }   
    public void PREORDEN(class_Nodo r){
        if(r != null){
            System.out.println(r.dato);
            PREORDEN(r.hIz);
            PREORDEN(r.hDer);
        }
    } 
    public void POSTORDEN(class_Nodo r){
        if(r != null){
            POSTORDEN(r.hIz);
            POSTORDEN(r.hDer);
            System.out.println(r.dato);
        }
    }   
     public boolean arbolVacio(){
        return raiz == null; 
    }
}
