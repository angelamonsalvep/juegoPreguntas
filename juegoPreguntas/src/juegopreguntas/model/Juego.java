/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopreguntas.model;


public class Juego {
    
    private int id;
    private Jugador jugador;
    private int acumulado;

    public Juego() {
    }

    public Juego(int id, Jugador jugador, int acumulado) {
        this.id = id;
        this.jugador = jugador;
        this.acumulado = acumulado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }
    
    
}
