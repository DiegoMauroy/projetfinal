package be.ac.umons;

import java.util.ArrayList;
import java.util.Date;

public interface Componentressoucretask {
    public abstract String getNom();
    public abstract long getDuree();
    public abstract void addressource(Ressource r);
    public abstract Date getDatedebut();
    public abstract Date getDatefin();
    public abstract String getSkill();
    public abstract ArrayList<Ressource> getListressource();

}
