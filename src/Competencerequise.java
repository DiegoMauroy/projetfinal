import java.util.ArrayList;
import java.util.Date;

public class Competencerequise implements Strategytaskworker {
    Worker s;
    String x;
    ArrayList<Task> y;
    Task t;
    Date db, df, DB, DF;
    String S;
    float out, out2;
    public void association(ArrayList<Worker> T, Task t) {
        S = t.getSkill();
        DB = t.getDatedebut();
        DF = t.getDatefin();
        for (int i = 0; i< T.size(); i++){
            s = T.get(i);
            x = s.getSkillw();
            if (x == S){
                y = s.getTache();
                for (int j=0; j<y.size(); j++){
                    t = y.get(j);
                    df = t.getDatefin();
                    out = df.compareTo(DB);
                    if (out<0){
                        t = y.get(j+1);
                        db = t.getDatedebut();
                        out2 = DF.compareTo(db);
                        if(out2<0){

                            break;
                        }
                    }
                }
            }
        }
    }
}
