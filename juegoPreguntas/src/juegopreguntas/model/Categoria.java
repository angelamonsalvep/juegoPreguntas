/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopreguntas.model;

import java.util.ArrayList;


public class Categoria {
    
    private int id;
    private String descripcion;
    private int nivelDificultad;
    private ArrayList<Pregunta> PreguntasList;

    public Categoria() {
    }

    public Categoria(int id, String descripcion, int nivelDificultad, ArrayList<Pregunta> PreguntasList) {
        this.id = id;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.PreguntasList = PreguntasList;
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

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public ArrayList<Pregunta> getPreguntasList() {
        return PreguntasList;
    }

    public void setPreguntasList(ArrayList<Pregunta> PreguntasList) {
        this.PreguntasList = PreguntasList;
    }
    
    
}
