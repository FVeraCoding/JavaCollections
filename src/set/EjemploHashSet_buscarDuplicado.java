
package set;

import java.util.HashSet;
import java.util.Set;


public class EjemploHashSet_buscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Ródalo", "Atún", "Lenguado"};
        
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        
        for(String pez : peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        
        System.out.println(duplicados.size() + " elementos duplicado/s: "+duplicados);
        
        System.out.println(unicos.size() + " elementos no duplicados: "+unicos);
    }
}
