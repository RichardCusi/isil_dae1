package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Borramos los constructores y metodos para ser generados por lombok, a traves de anotaciones
//estas_lineas_reemplaza_todo_el_codigo_borrado

//Getters and setter
@Data
//Consutructor full
@AllArgsConstructor
//Constructor vacio
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String lastnamefather;
    private String lastnamemother;
    private Integer age;


}
