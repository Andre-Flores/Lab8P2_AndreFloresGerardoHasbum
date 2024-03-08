/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_andrefloresgerardohasbum_;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Torneo implements Serializable{

    private String nombre;
    public ArrayList<Participante> participantes = new ArrayList();
    private boolean flagAbierto, flagGanador;
    private Participante ganador;
    public Torneo() {
    }

    public Torneo(String nombre, boolean flagAbierto, boolean flagGanador, Participante ganador) {
        this.nombre = nombre;
        this.flagAbierto = flagAbierto;
        this.flagGanador = flagGanador;
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFlagAbierto() {
        return flagAbierto;
    }

    public void setFlagAbierto(boolean flagAbierto) {
        this.flagAbierto = flagAbierto;
    }

    public boolean isFlagGanador() {
        return flagGanador;
    }

    public void setFlagGanador(boolean flagGanador) {
        this.flagGanador = flagGanador;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }
    

    @Override
    public String toString() {
        return nombre;
    }

}
