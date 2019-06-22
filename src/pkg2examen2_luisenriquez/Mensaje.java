/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2examen2_luisenriquez;

import java.util.Date;

/**
 *
 * @author Luis Enriquez
 */
class Mensaje {
    String contenido;
    String hora;
    String fecha;
    boolean leido;

    public Mensaje(String contenido) {
        this.contenido = contenido;
        Date d = new Date();
        
        hora = d.getHours() + ":" + d.getMinutes();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "[" + hora + "] " + contenido;
    }
    
    
}
