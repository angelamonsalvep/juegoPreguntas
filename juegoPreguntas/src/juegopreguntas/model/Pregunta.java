/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopreguntas.model;

import java.util.ArrayList;


public class Pregunta {
    
    private int id;
    private String descripcion;
    private ArrayList<Respuesta> opciones;

    public Pregunta() {
    }

    public Pregunta(int id, String descripcion, ArrayList<Respuesta> opciones) {
        this.id = id;
        this.descripcion = descripcion;
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Respuesta> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Respuesta> opciones) {
        this.opciones = opciones;
    }
    
    
}
