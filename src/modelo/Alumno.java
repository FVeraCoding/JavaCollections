
package modelo;


public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int nota;

    public Alumno(){
        
    }
    
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+ " - Nota: "+nota;
    }

    @Override
    public int compareTo(Alumno a) {
        if(this.nota == a.nota){
            return 0;
        }else if(this.nota < a.nota){
            return -1;
        }else{
            return 1;
        }
    }
    
    
    
}
