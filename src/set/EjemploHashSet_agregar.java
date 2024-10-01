
package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class EjemploHashSet_agregar {

    
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        List<String> lista; // Se puede pasar cualquier Collection en el constructor de una lista para crearla con sus elementos.
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        
        lista = new LinkedList<>(hs); // Creamos linkedList con los elementos de hs y lo ordenamos.
        Collections.sort(lista);
        
        System.out.println("HashSet: "+hs);
        System.out.println("List: "+lista); // Ordenacion por defecto de manera alfabética.
        
        boolean agregado = hs.add("tres");
        System.out.println("\nPermite HashSet elementos duplicados? " + agregado);
    }
    
}
