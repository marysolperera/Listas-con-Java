/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u
 */
public class Lista {     
    protected Nodo inicio, fin; //punteros para saber donde está el inicio y el fin
    public Lista(){
        inicio = fin= null;
        
    }     // Método para sabder si la lista está vacía
    public boolean vacia(){
        if (inicio == null){
            
            return true;
        }
        else{
            return false;
        }
    }
    
    // Método para insertar al final de la lista
    public void agregarFin(int e){
        if (!vacia()){
            fin.siguiente = new Nodo(e);
            fin=fin.siguiente;
        }
        else{
            inicio = fin = new Nodo(e);
        }
    }
    
    // método para agregar un nodo al inicio de la lista
    public void agregarInicio(int e){
        inicio = new Nodo(e, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    // método para mostrar los datos
    public void mostrarLista(){
        System.out.println("");
        Nodo recorrer = inicio;
        while (recorrer != null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer=recorrer.siguiente;
        }
    }

    public int eliminarInicio(){
        int e=inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return e;
    }

    public int eliminarFinal(){
        int e=fin.dato;
        if(inicio==fin){
            inicio = fin = null;
        }else{
            
            Nodo recorrer = inicio;
            while(recorrer.siguiente != fin){
                recorrer=recorrer.siguiente;
            }
            fin=recorrer;
            fin.siguiente=null;
        }
        return e;
    }

    public int eliminarNodo(int e){
        if (!vacia()){
            if (inicio==fin && e==inicio.dato){
                inicio=fin=null;
            }else{
                if(e==inicio.dato){
                    inicio=inicio.siguiente;
                }else{
                    Nodo anterior, temporal;
                    anterior=inicio;
                    temporal=inicio.siguiente;
                    while(temporal!=null && temporal.dato!=e){
                        anterior=anterior.siguiente;
                        temporal=temporal.siguiente;
                    }
                    if (temporal!=null){
                        anterior.siguiente=temporal.siguiente;
                        if(temporal==fin){
                            fin=anterior;
                        }
                    }
                }
            }
        }
        return e;
    }
}
