package be.ac.umons;

import java.util.ArrayList;
import java.util.Date;

public class Manager extends Personne {
    ArrayList<Worker> T;
    Task t;
    private static Manager instance = null;

    private Strategytaskworker strategy;
    public Manager (ArrayList<Worker> T, Task t, Strategytaskworker strategy){
        this.T = T;
        this.t = t;
        this.strategy = strategy;
    }
    void choix(){
        strategy.association(T,t);
    }
    Manager(){

    }

    public static Manager getManager() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    @Override
    public long getDuree() {
        return 0;
    }

    @Override
    public void addressource(Ressource r) {

    }

    @Override
    public Date getDatedebut() {
        return null;
    }

    @Override
    public Date getDatefin() {
        return null;
    }

    @Override
    public String getSkill() {
        return null;
    }


    @Override
    public ArrayList<Ressource> getListressource() {
        return null;
    }

    @Override
    public void addworker(Worker w) {

    }

    @Override
    public ArrayList<Worker> getTeam() {
        return null;
    }

}
