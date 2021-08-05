import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    public static void main(String[] args) throws Exception {
        long ts = 1628193107; // This is the TS value of each entry
        double score = 100.00032; // This is the SCORE value of each entry
        double live_score = calc_live_score(score, ts); // This is the live score
    }

    public static double calc_live_score(double scoreTimeZero, long ts){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        double current_time = timestamp.getTime()/1000 - ts;
        double live_score = (scoreTimeZero) / (1 + Math.exp( (3/(scoreTimeZero)) * ((current_time/3600) - (2.5 * scoreTimeZero))));
        return live_score;

    }
}
