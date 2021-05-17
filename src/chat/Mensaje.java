/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author arelm
 */
public class Mensaje implements Serializable{
      private String nomUsu;
    private String mens;
    private String tipo;
    private Date fecha;


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuarios() {
        return nomUsu;
    }

    public void setUsuarios(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getMens() {
        return mens;
    }

    public void setMens(String mens) {
        this.mens = mens;
    }
    
}
