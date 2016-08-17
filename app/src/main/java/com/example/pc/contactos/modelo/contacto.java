package com.example.pc.contactos.modelo;

import android.content.ContentValues;

/**
 * Created by PC on 17/08/2016.
 */
public class contacto {

    String nombre,telefono,especialidad,biografia ,avatar,id;


    public contacto(String nombre, String telefono, String especialidad, String biografia, String avatar) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.biografia = biografia;
        this.avatar = avatar;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public ContentValues aContentValues(){

       ContentValues contenido =new ContentValues();



            contenido.put(esquema.CONTACTO_NOMBRE,this.nombre);
            contenido.put(esquema.CONTACTO_TELEFONO,this.telefono);
            contenido.put(esquema.CONTACTO_ESPECIALIDAD,this.especialidad);
            contenido.put(esquema.CONTACTO_BIOGRAFIA,this.biografia);
            contenido.put(esquema.CONTACTO_AVATAR,this.avatar);




      return contenido;
    };
}
