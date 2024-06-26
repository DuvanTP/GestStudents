//calcular el vector suma de dos vectores ingresados
package studentsProyect;
import studentsProyect.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<String> materias = new ArrayList<>(List.of("matematicas", "fisica", "ingles", "ciencias sociales"));
            List<String> profesores = new ArrayList<>(List.of("Bayron", "Daniela", "yudis"));
            List<Double> notas = new ArrayList<>(List.of(2.3, 5.0, 4.3, 4.34));
            Student estudiante1 = new Student(1,19,9,"juan",materias,profesores,notas);
            
            System.out.println(estudiante1.toString());
            System.out.println(estudiante1.calcularPromedio());
    }
}
