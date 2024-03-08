/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_andrefloresgerardohasbum_;

/**
 *
 * @author andre
 */
public class Admin extends User{

    private int torneosCreados = 0;

    public Admin() {
    }

    public Admin(String nombre, String password, int torneosCreados) {
        super(nombre, password);
        this.torneosCreados = torneosCreados;
    }

    public int getTorneosCreados() {
        return torneosCreados;
    }

    public void setTorneosCreados(int torneosCreados) {
        this.torneosCreados = torneosCreados;
    }

    @Override
    public String toString() {
        return super.toString() + " ha creado " + torneosCreados + " torneos";
    }

}
