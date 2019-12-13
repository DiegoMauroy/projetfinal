import java.util.Scanner;

public abstract class Personne implements Componentteampersonne, Componentressoucretask {

    public String nom;
    public String prenom;
    public String statut;

    Personne() {

    };
    public void saisiepersonne(){
        System.out.println("Entrez le nom: ");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
        System.out.println("Entrez le prénom: ");
        Scanner lectureClavier2 = new Scanner(System.in);
        prenom = lectureClavier2.next();
        System.out.println("Entrez le statut: ");
        Scanner lectureClavier3 = new Scanner(System.in);
        statut = lectureClavier.next();
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return  prenom;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public void setPrenom(String p){
        this.prenom=p;
    }
    public void setStatut(String s){
        this.statut=s;
    }
    public static Personne getStatut(String s){
        if(s == "Manager"){
            return new Manager();
        }
        else if (s == "Worker"){
            return new Worker();
        }
        else {System.out.print("ce nom n'existe pas");
            return null;
        }
    };
}
