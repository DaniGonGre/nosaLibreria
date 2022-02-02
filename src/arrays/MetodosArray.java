package arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MetodosArray {
    
    public static float[] crearArray(float[] lista){
        
        for(int i=0; i<lista.length; i++){
        lista[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce a nota: "));
        }
        
        return lista;
        
    }
    
    public static void amosarArray(float[] lista){
        int op; 
            
            op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" + "\n" + 
            "1 --> For" + "\n" + "2 --> For each" + "\n" + "3 --> Clase arrays"));
            
            switch (op){
                case 1 : for(int i=0; i<lista.length; i++)
                         System.out.println("Posicion: " + i + " --> " + lista[i]);   
                         break;
                case 2 : for(float elemento: lista)
                         System.out.println(elemento);
                case 3 : System.out.println(Arrays.toString(lista));
                         break;
                default : System.out.println("Opción incorrecta");
            }
            
                    
    }
    
    public static int buscarElemento(float[] lista){
        
        float eleBuscar = Float.parseFloat(JOptionPane.showInputDialog("Nota a buscar: "));
        int atopado =0; //non está
        int posicion =0;
        
        for (int i=0; i<lista.length; i++){
            
            if(eleBuscar == lista[i]){
                System.out.println(eleBuscar + " está na lista.");
                posicion = i;
                atopado = 1;
                break;
            }
        }
        
        if(atopado == 0){
            System.out.println("Non está na lista");
            posicion = -1;
        }
        return posicion;
    }
    
    public static void ordenarElemento(float[] lista){
        float aux= 0;
        for (int i=0; i<lista.length-1; i++){
            for (int j= 1+i; j<lista.length; j++){
                if (lista[i]>lista[j]){
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
                    
            }
        }
    }
    // tamén utilizando a clase Arrays
    // Arratys.sort(lista);
    
    public static float[] copiarLista(float[]lista){
        lista= Arrays.copyOf(lista, 8);
        return lista;
    }
    
    public static float[] borrarElemento(float[]lista){
        int pos= MetodosArray.buscarElemento(lista);
        if(pos<0)
            System.out.println("O elemento non está na lista.");        
            else{
        for (int i=pos; i < lista.length - 1; i++)
            lista[i]= lista[i+1];        
        lista= Arrays.copyOf(lista, lista.length -1);
        } 
        return lista;
    }
    
    public static float[] engadir(float[] lista){
        float eleEngadir= Float.parseFloat(JOptionPane.showInputDialog("Introduce o "
        + "numero que queras engadir: "));
        lista= Arrays.copyOf(lista, lista.length +1);
        lista[lista.length -1] = eleEngadir;
        return lista;
    }
    
    public void sair(){
        System.exit(0);
    }
}
    

