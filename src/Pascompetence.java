import java.util.ArrayList;
import java.util.Date;

public class Pascompetence implements Strategytaskworker {
    Worker w;
    ArrayList<Task> y;
    Task ta;
    Date db, df, DB, DF;
    float out, out2;
    public void association(ArrayList<Worker> T, Task t) {
        DB = t.getDatedebut();
        DF = t.getDatefin();
        for (int i = 0; i<T.size(); i++) {
            w = T.get(i);
            y = w.getTache();
            for (int j = 0; j < y.size(); j++) {
                ta = y.get(j);
                df = ta.getDatefin();
                out = df.compareTo(DB);
                if (out < 0) {
                    ta = y.get(j + 1);
                    db = ta.getDatedebut();
                    out2 = DF.compareTo(db);
                    if (out2 < 0) {
                        y.add(j + 1, t);
                        w.setTache(y);
                        break;
                    }
                }
            }
        }
    }
}
