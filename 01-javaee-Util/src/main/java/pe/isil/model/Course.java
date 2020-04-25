package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Getters and setter
@Data
//Consutructor full
@AllArgsConstructor
//Constructor vacio
@NoArgsConstructor
public class Course {
    private Integer id;
    private String nombreCurso;
    private Integer credits;
    private String teacherName;

}
