import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {
    public void main(String[] args) throws ParseException {
        String S;
        ArrayList<Worker> T = new ArrayList<>();
        int n;
        Manager m = new Manager();
        m.saisiepersonne();
        Team te= new Team();
        te.saisieteam();
        System.out.println("Entrez le nombre de worker de la team: ");
        Scanner lectureClavier = new Scanner(System.in);
        n = lectureClavier.nextInt();
        for (int i=0; i<n ; i++) {
            Worker p = new Worker();
            p.saisieworker();
            te.addworker(p);
        }
        System.out.println("Entrez la tâche: ");
        Task t = new Task();
        t.saisietask();
        S = t.getSkill();
        T = te.getTeam();
        if (S != null) {
            Strategytaskworker Competencerequise = new Competencerequise();
            Manager u = new Manager(T, t, Competencerequise);
        }
        else{
        Strategytaskworker Pascompetence = new Pascompetence();
        Manager s = new Manager(T, t, Pascompetence);
        }


    }
}
