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
public class Proyecto {
    //PROPIEDADES
    private String nombreClave;
    private String denominación;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Empresa empresa;
    private List<Empleado> ListaDeEmpleados;
    private Promotor empleadoPromotor;
    private List <Tarea> ListaDeTareas;
    
    //Constructores
public Proyecto(){
}
public Proyecto(String nombreClave, String denominación){
    this.nombreClave = nombreClave;
    this.denominación = denominación;
}
}
