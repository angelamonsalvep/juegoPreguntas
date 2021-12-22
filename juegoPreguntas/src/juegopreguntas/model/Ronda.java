/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopreguntas.model;


public class Ronda {
    
    private int id;
    private String descripcion;
    private Pregunta pregunrta;
    private int premio;

    public Ronda() {
    }

    public Ronda(int id, String descripcion, Pregunta pregunrta, int premio) {
        this.id = id;
        this.descripcion = descripcion;
        this.pregunrta = pregunrta;
        this.premio = premio;
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

    public Pregunta getPregunrta() {
        return pregunrta;
    }

    public void setPregunrta(Pregunta pregunrta) {
        this.pregunrta = pregunrta;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    
}
