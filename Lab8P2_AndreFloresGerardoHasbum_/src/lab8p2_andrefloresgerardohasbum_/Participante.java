package lab8p2_andrefloresgerardohasbum_;

import java.util.ArrayList;

public class Participante extends User{

    public ArrayList<Torneo> inscritos = new ArrayList();
    public ArrayList<Torneo> ganados = new ArrayList();

    public Participante(String nombre, String password) {
        super(nombre, password);
    }

    public ArrayList<Torneo> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Torneo> inscritos) {
        this.inscritos = inscritos;
    }

    public ArrayList<Torneo> getGanados() {
        return ganados;
    }

    public void setGanados(ArrayList<Torneo> ganados) {
        this.ganados = ganados;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
