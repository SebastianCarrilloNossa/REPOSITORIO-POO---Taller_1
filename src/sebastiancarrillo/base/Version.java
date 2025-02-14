/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancarrillo.base;

import java.io.File;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Version {
    //PROPIEDADES
    private Date fecha;
    private String descripción;
    private File archivo;
    private Documento documento;
    
         //CONSTRUCTORES
      public Version(){
    }
      //CONSTRUCTORES CON PARAMETROS
       public Version(Date fecha, String d){
           this.fecha=fecha;
           descripción=d;
    }
}
