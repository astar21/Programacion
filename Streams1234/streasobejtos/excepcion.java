/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streasobejtos;

/**
 *
 * @author Marco
 */

public class excepcion extends Exception{
    public excepcion (String mensaje, Throwable causa)
    {
        super(mensaje, causa);
    }
}