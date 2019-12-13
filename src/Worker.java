import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Worker extends Personne{
    public String statutworker;
    public String skill;
    public ArrayList<Task> tache;
    Worker(){

    };
    public void saisieworker(){
        System.out.println("Entrez le statut du worker: ");
        Scanner lectureClavier = new Scanner(System.in);
        statutworker = lectureClavier.next();
        System.out.println("Entrez sa compétence: ");
        Scanner lectureClavier2 = new Scanner(System.in);
        skill = lectureClavier2.next();
    }

    public ArrayList<Task> getTache() {
        return tache;
    }
    public void setTache(ArrayList<Task> tache) {
        this.tache = tache;
    }
    public String getStatutworker(){
        return statutworker;
    }
    public String getSkillw(){
        return skill;
    }
    public void setStatutworker(String sw){
        this.statutworker=sw;
    }
    public void setSkill(String s){this.skill = s;}

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
