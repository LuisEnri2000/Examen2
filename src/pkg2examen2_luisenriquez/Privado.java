/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2examen2_luisenriquez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Luis Enriquez
 */

class Chat implements Serializable{
    ArrayList<Mensaje> mensajes;
}

class Privado extends Chat implements Serializable{
    Usuario usuario;

    public Privado(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat con " + usuario;
    }
    
    
    
}

class Grupo extends Chat implements Serializable{
    String nombre;
    ArrayList<Usuario> miembros;
    Usuario admin;

    public Grupo(String nombre, ArrayList<Usuario> miembros, Usuario admin) {
        this.nombre = nombre;
        this.miembros = miembros;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Grupo " + nombre;
    }  
}