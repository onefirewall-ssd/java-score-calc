import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.getTime()/1000);                      // 2021-03-24 16:34:26.666

        System.out.println("A:" + calc_live_score(100) );
    }

    public static double calc_live_score(double score){
        // return (scoreTimeZero) / (1 + Math.exp( (3/(scoreTimeZero)) * ((current_time/3600) - (2.5 * scoreTimeZero))))
        return 0.32;
    }
}
