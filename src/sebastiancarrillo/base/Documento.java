/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastiancarrillo.base;

import java.util.List;

/**
 *
 * @author HP
 */
public class Documento {
    //PROPIEDADES
    private String código;
    private String descripción; 
    private String tipo;
    private Tarea tarea;
    private List <Version> ListaDeVersiones;
    
        //CONSTRUCTORES
      public Documento(){
    }
      //CONSTRUCTORES CON PARAMETROS
       public Documento(String código, String desc){
           this.código=código;
           this.descripción=desc;
    }
}
