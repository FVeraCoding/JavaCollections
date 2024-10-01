/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Fernando
 */
public class EjemploTreeSetComparable {
    
    public static void main(String[] args) {
        Set<Alumno> setAlumno = new TreeSet<>();
        
        setAlumno.add(new Alumno("Fernando", 9));
        setAlumno.add(new Alumno("Juan", 6));
        setAlumno.add(new Alumno ("Julia", 7));
        setAlumno.add(new Alumno ("Lucia", 4));
        setAlumno.add(new Alumno ("Penelope", 3));
        setAlumno.add(new Alumno ("Zeus", 10));
        
        System.out.println(setAlumno);
    }
 
}
