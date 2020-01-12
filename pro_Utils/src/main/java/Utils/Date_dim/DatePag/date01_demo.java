package Utils.Date_dim.DatePag;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date01_demo {

    public static void main(String[] args) throws ParseException {

        //创建日期字符串
        String dateStr = "2000-01-01";

        int dateseq = 1;
        //创建日期格式转换
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //创建calendar 对象
        Calendar instance = Calendar.getInstance();
        instance.setTime(simpleDateFormat.parse(dateStr ));
        for (int i = 0;i < 100 ;i++)
        {
            instance.add(Calendar.DAY_OF_WEEK,dateseq );
            simpleDateFormat.format(instance.getTime());
        }


    }

}
