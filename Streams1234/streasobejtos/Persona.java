/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streasobejtos;
import java.io.Serializable;
/**
 *
 * @author Marco
 */
public class Persona implements Serializable {
/*
  Alumno: Pepe García Hernández
------------------------------   -------
Módulo                            Nota
------------------------------   -------
Lenguaje de marcas         5
Programación                   7
Entornos de desarrollo     3
Base de datos                  7
Sistemas informáticos      10
FOL                                  c-5 */
  String nombre;
  String apellido;
  String apillido2;
  String m;
  String prog;
  String end;
  String bd;
  String si;
  String fol;
   public Persona(){
    
}

    public Persona(String nombre, String apellido, String apillido2, String m, String prog, String end, String bd, String si, String fol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apillido2 = apillido2;
        this.m = m;
        this.prog = prog;
        this.end = end;
        this.bd = bd;
        this.si = si;
        this.fol = fol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApillido2() {
        return apillido2;
    }

    public void setApillido2(String apillido2) {
        this.apillido2 = apillido2;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getProg() {
        return prog;
    }

    public void setProg(String prog) {
        this.prog = prog;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getFol() {
        return fol;
    }

    public void setFol(String fol) {
        this.fol = fol;
    }
   
   
}
