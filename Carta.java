package ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmede_000
 */
public abstract class Carta {
    public String Nombre;
    public String Descripcion;
    
    
    /******** Funcion: Activar ********************
    Descripcion: no posee descripcion al ser un metodo abstracto
    Parametros:
    Sansano Objetivo
    Retorno: void
    ************************************************/
    public abstract void Activar(Sansano Objetivo);
    
    /**** Getter and setter ****/
    
    /******** Funcion: setNombre ********************
    Descripcion: le asigna el valor de nombre a la carta
    Parametros:
    String nombre
    Retorno: void
    ************************************************/
    public void setNombre(String nombre){
        Nombre=nombre;
    }
    
    /******** Funcion: getNombre ********************
    Descripcion: obtiene el nombre de la carta
    Parametros:
    Retorno: String, el nombre de la carta
    ************************************************/
    public String getNombre(){
        return Nombre;
    }
    
    /******** Funcion: setDescripcion ********************
    Descripcion: le asigna una descripcion a la carta ("1" para Curso, "2" para Profesor y "3" para Carrete)
    Parametros:
    String Descri
    Retorno: void
    ************************************************/
    public void setDescripcion(String descri){
        Descripcion=descri;
    }
    
    /******** Funcion: getDescripcion ********************
    Descripcion: obtiene la descripcion de la carta
    Parametros:
    Retorno: String, retorna la descripcion de la carta
    ************************************************/
    public String getDescripcion(){
        return  Descripcion;
    }
}


