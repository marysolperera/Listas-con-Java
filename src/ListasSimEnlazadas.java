
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @aut
 */
public class ListasSimEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listita = new Lista();
        int opcion=0, el;
        do{
            try{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento a la lista \n2. Agregar un elemento al final de la lista\n3. Mostrar los datos de la lista\n4. Eliminar al inicio \n5. Eliminar al final \n6. Eliminar un nodo en particular\n7. Salir","Menú de opciones",3));
                switch(opcion){
                    case 1: try{
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando al inicio",3));
                        listita.agregarInicio(el);
                    }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                        break;
                    case 2:try{
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando al final",3));
                        listita.agregarFin(el);
                    }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                        break;
                    case 3: listita.mostrarLista();
                        break;
                    case 4: el=listita.eliminarInicio();
                    JOptionPane.showMessageDialog(null,"Elemento eliminado es " +el);
                    break;
                    case 5: el=listita.eliminarFinal();
                    JOptionPane.showMessageDialog(null,"Elemento eliminado es " +el);
                    break;
                    case 6: el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a eliminar"));
                    listita.eliminarNodo(el);
                    case 7: break;
                    default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while(opcion!=7);
    }
    
}
