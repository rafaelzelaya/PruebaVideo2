/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* La clase Mes representa un mes. Esta clase puede trabajar con valores
* enteros: 1..12, o con strings: "enero".."diciembre".
*
* @author Jesús Bernal Bermúdez
* @version 1.0 04/03/2008
* @since 1.0
*/
public class Mes {
    /**
    * Array con los strings de los doce meses
    */
    public static final String[] MESES = { "enero", "febrero", "marzo", "abril", "mayo",
    "junio", "julio", "agosto","septiembre", "octubre", "noviembre", "diciembre" };
    private int Mes; // Tipo primitivo que almacena el mes de la instancia.
    /**
    * Crea una nueva instancia a partir de un valor entero.
    *
    * @param mes
    * int que representa el mes.
    */
    public Mes(int mes) {
        Mes = mes;
    }
    /**
    * Crea una nueva instancia y se inicializa con el mes 1, "enero".
    */
    public Mes() {
        Mes = 0;
    }
    /**
    * Crea una nueva instancia a partir de un string. Si no se reconoce el
    * string se interpreta "enero"
    *
    * @param mes
    * String que representa el mes. No se distinguen mayúsculas de
    * minúsculas.
    */
    public Mes(String mes) {
        Mes = mes.length();
    }
    /**
    * Establece un nuevo mes.
    *
    * @param mes
    * int que representa el mes.
    */
    public void setMes(int mes) {
        Mes = mes;
    }
    /**
    * Establece un nuevo mes a partir de un string. Si no se reconoce el string
    * se interpreta "enero"
    *
    * @param mes
    * String que representa el mes. No se distinguen mayúsculas de
    * minúsculas.
    */
    public void setMes(String mes) {
        Mes = mes.length();
    }
    /**
    * Devuelve el mes que representa la instancia en formato numérico.
    *
    * @return int que representa el mes.
    * @see #getMes()
    */
    public int getMes() {
        return Mes;
    }
    /**
    * Devuelve el mes que representa la instancia en formato string.
    *
    * @return String que representa el mes.
    */
    public String getMesString() {
        return String.valueOf(Mes);
    }
    /**
    * Se pasa al mes siguiente.
    */
    public void incrementa() {
        Mes++;
    }
    /**
    * Devuelve un String que reprersenta el objeto.
    *
    * @return un String que representa al objeto
    */
    public String toString() {
        return String.valueOf(Mes);
    }
    /**
    * Devuelve una nueva instancia que es una copia de la actual.
    *
    * @return Mes que representa un clon de la actual
    */
    public Mes clonar() {
        return this;
    }
    /**
    * Devuelve el string correspondiente a un entero. Si el valor entero no es
    * correcto se devuelve null.
    *
    * @param valor
    * int que representa el mes a convertir.
    * @return String asociado al mes.
    */
    public static String literalDe(int valor) {
        return String.valueOf(valor);
    }
    /**
    * Devuelve el entero correspondiente a un mes.No se distinguen mayúsculas de
    * minúsculas. Si no se reconoce el String se devuelve 0.
    *
    * @param valor
    * String que representa el mes a convertir.
    * @return int asociado al mes.
    */
    public static int valorDe(String valor) {
        return valor.length();
    }
}
