package be.ac.umons;

import java.util.ArrayList;

public interface Componentteampersonne {
    public abstract String getNom();
    public abstract void addworker(Worker w);
    public abstract ArrayList<Worker> getTeam();
    public abstract String getPrenom();
}
