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
class Usuario extends Persona implements Serializable {
    String user;
    String pass;
    ArrayList<Privado> chats = new ArrayList();
    ArrayList<Grupo> grupos = new ArrayList();
    ArrayList<Usuario> amigos = new ArrayList();
    ArrayList<Usuario> solis = new ArrayList();

    public Usuario(String user, String pass, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.user = user;
        this.pass = pass;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Usuario> getSolis() {
        return solis;
    }

    public void setSolis(ArrayList<Usuario> solis) {
        this.solis = solis;
    }   
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Privado> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Privado> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "[" + user + "]";
    }
    
    
    
}
