/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labextrap2_diegolara;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Deporte {
    private String nombre;
    private ArrayList<Torneo> listaTorneo = new ArrayList<>();
    private int periodo;

    public Deporte() {
    }

    public Deporte(int periodo, String nombre) {
        this.periodo = periodo;
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getListaTorneo() {
        return listaTorneo;
    }

    public void setListaTorneo(ArrayList<Torneo> listaTorneo) {
        this.listaTorneo = listaTorneo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Deporte{" + "listaTorneo=" + listaTorneo + ", periodo=" + periodo + '}';
    }
    
    
}
