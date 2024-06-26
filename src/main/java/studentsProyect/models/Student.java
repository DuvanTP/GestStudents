package studentsProyect.models;

import java.util.List;

public class Student {
    private int id;
    private int edad;
    private int añoEscolar;
    private String nombre;
    private List<String> materias;
    private List<String> profesores;
    private List<Double> notas;

    public Student() {
    }

    public Student(int id, int edad, int añoEscolar, String nombre, List<String> materias, List<String> profesores, List<Double> notas) {
        this.id = id;
        this.edad = edad;
        this.añoEscolar = añoEscolar;
        this.nombre = nombre;
        this.materias = materias;
        this.profesores = profesores;
        this.notas = notas;
    }
    
    public Double calcularPromedio() {
        return this.notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);        
    }

    @Override
    public String toString() {
        return "EstudianteDeInstituto{" + "id=" + id + ", edad=" + edad + ", a\u00f1oEscolar=" + añoEscolar + ", nombre=" + nombre + ", materias=" + materias + ", profesores=" + profesores + ", notas=" + notas + '}';
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñoEscolar() {
        return añoEscolar;
    }

    public void setAñoEscolar(int añoEscolar) {
        this.añoEscolar = añoEscolar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public List<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    
}




