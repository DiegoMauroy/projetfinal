package be.ac.umons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Task implements Strategytaskworker, Componentressoucretask {
    public String nom, date;
    public long duree;
    public Date datedebut, datefin;
    public String skill;
    public ArrayList<Ressource> listressource;
    int n;

    Task(){

    };
    public void saisietask() {
        System.out.println("Entrez le nom de la tâche: ");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
        System.out.println("Entrez la date de début: ");
        Scanner lectureClavier2 = new Scanner(System.in);
        date = lectureClavier2.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy hh:mi::ss");
        try {
            datedebut = sdf1.parse(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Entrez la date de fin: ");
        Scanner lectureClavier3 = new Scanner(System.in);
        date = lectureClavier3.next();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy hh:mi::ss");
        try {
            datefin = sdf2.parse(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        duree = datefin.getTime() - datedebut.getTime();
        System.out.println("Entrez la compétence requise: ");
        Scanner lectureClavier4 = new Scanner(System.in);
        skill = lectureClavier4.next();
        System.out.println("Entrez le nombre de ressource: ");
        Scanner lectureClavier5 = new Scanner(System.in);
        n = lectureClavier5.nextInt();
        for (int i = 0; i<n ; i++) {
            System.out.println("Entrez la ressource: ");
            Ressource r =  new Ressource();
            r.saisieressource();
            listressource.add(r);
        }
    }
    public String getNom(){
        return nom;
    }
    public long getDuree(){
        return duree;
    }
    public void addressource(Ressource r){
        listressource.add(r);
    }
    public Date getDatedebut(){
        return datedebut;
    }
    public Date getDatefin(){
        return datefin;
    }
    public String getSkill(){
        return skill;
    }
    public ArrayList<Ressource> getListressource() {
        return listressource;
    }

    @Override
    public void association(ArrayList<Worker> T, Task t) {
    }
}
