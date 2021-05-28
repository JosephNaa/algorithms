import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class year2016 {
    public static void main(String[] args) throws ParseException {
        int a = 5;
        int b = 24;

        solution(a, b);
    }

    private static String solution(int a, int b) throws ParseException {
        String answer = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        String str_date = "";
        int dayOfWeek = 0;

        if(a < 10){
            String tmp_a = Integer.toString(a);
            str_a = "0" + tmp_a;
        }
        if(b < 10){
            String tmp_b = Integer.toString(b);
            str_b = "0" + tmp_b;
        }
        str_date = "2016"+str_a+str_b;

        Date date = formatter.parse(str_date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch(dayOfWeek){
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
                break;
        }

        return answer;
    }
}
