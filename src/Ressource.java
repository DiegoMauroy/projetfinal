import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ressource implements Componentressoucretask {
    public String nom;
    Ressource(){

    };

    public void saisieressource(){
        System.out.println("Entrez le nom de la ressource: ");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
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
}
