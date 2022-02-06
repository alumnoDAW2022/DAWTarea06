package clases;

import clases.Figura;

/**
 * Clase Circulo
 *
 * Esta clase modela la figura de un círculo
 * Hereda de la clase Figura
 *
 * @version 0.0.1, 31/01/2022
 * @author Programador
 * @see Figura
 */ 
public class Circulo extends Figura{
      
   /**
    * Constante pi del circulo
    */	
    final double pi=3.1416;

   /**
    * Radio del circulo
    */ 
    private double radio;

    /**
     * Este método calcula el área del circulo
     * @return área
     */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }

   /**
    * Devuelve el valor de radio (getter)
    * @return radio
    */
    public double getRadio() {
        return radio;
    }

   /**
    * Configura el valor de radio (setter)
    * @param radio
    */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
