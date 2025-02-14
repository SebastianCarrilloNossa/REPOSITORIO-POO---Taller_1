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
public class Promotor extends Empleado {
    //PROPIEDADES
    private List <Proyecto> ListaDeProyectos;
    
    //CONSTRUCTORES
    public Promotor(){
      super();//llama el constructor de empleado class
    }
     public Promotor(String n , String a){
      super(n , a);
    }
}
