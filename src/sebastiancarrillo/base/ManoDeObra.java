/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancarrillo.base;

import java.util.Date;

/**
 *
 * @author HP
 */
public class ManoDeObra {
    //PROPIEDADES
    private Empleado trabajador;
    private Proyecto proyecto;
    private Date fechaInicio;
    private Date fechafin;
    private String rol;
    
            //CONSTRUCTORES
      public ManoDeObra(){
    }
      //CONSTRUCTORES CON PARAMETROS
       public ManoDeObra(Empleado e, Proyecto p){
          trabajador=e;
          proyecto=p;
    }
}
