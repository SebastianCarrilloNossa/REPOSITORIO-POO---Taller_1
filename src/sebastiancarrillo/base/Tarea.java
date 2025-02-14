/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancarrillo.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class Tarea {
    //PROPIEDADES
    private String descripción;
    private String tipo;
    private Date fechaInicioEstimado;
    private Date fechaInicioReal;
    private int duraciónEstimada;
    private int duraciónReal;
    private List<Empleado> ListaDeEmpleados;
    private Proyecto proyecto;
    private List <Documento> ListaDeDocumentos;
    
         //CONSTRUCTORES
      public Tarea(){
    }
      //CONSTRUCTORES CON PARAMETROS
       public Tarea(String d, String t){
           descripción=d;
           tipo =t;
    }
}
