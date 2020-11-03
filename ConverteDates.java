
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverteDates {


    public static String convertDate(Date date){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM//yyyy");

        try {
            return formatDate.format(date);

        } catch (Exception e) {
            return "Erro na conversão da data" + e;
        }
    }
}
