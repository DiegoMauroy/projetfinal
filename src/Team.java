import java.util.ArrayList;
import java.util.Scanner;

public class Team implements Componentteampersonne {
    public String nom;
    public ArrayList<Worker> team;
    Team(){

    }
    public void saisieteam(){
        System.out.println("Entrez le nom de la team: ");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
    }
    public String getNom(){
        return nom;
    }
    public void addworker(Worker w){
        team.add(w);
    }
    public ArrayList<Worker> getTeam() {
        return team;
    }
    @Override
    public String getPrenom() {
        return null;
    }


}
