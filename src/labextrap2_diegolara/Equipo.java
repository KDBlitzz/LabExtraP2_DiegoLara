/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labextrap2_diegolara;

/**
 *
 * @author diego
 */
public class Equipo {

    private String nombre;
    private int puntos;
    private String tipo;

    public Equipo() {
    }

    public Equipo(String nombre, int puntos, String tipo) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
