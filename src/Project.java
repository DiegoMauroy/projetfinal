import java.util.ArrayList;
import java.util.Date;

public class Project{
    public String nom;
    public Date datedebut, datefin;
    Project(){

    };
    public String getNom(){
        return nom;
    }
    public Date getDatedebut(){
        return datedebut;
    }
    public Date getDatefin(){
        return datefin;
    }
    public void setDatedebut(Date db){
        this.datedebut = db;
    }
    public void setDatefin(Date df){
        this.datefin = df;
    }
    public void setNom(String n){
        this.nom = n;
    }
}
