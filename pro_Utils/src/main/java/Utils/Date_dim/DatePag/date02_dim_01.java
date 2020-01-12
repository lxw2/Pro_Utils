package Utils.Date_dim.DatePag;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class date02_dim_01 {

    public static void main(String[] args) throws ParseException {

        // 1. 初始化上游变量
        String initDateStr = "2019-01-01";
        int setup = 1;
        Locale local = new Locale("en", "us");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", local);
        Date initDate = sdf.parse(initDateStr);

        calendar.setTime(initDate);
        calendar.add(Calendar.DAY_OF_MONTH, setup);

        Date curDate = calendar.getTime();

        // 2. 生成维度数据
        // 2.1 生成代理键
        sdf.applyPattern("yyyyMMdd");
        String date_key = sdf.format(curDate);

        // 2.2 年-月-日
        sdf.applyPattern("yyyy-MM-dd");
        String date_value = sdf.format(curDate);

        // 2.3 当年的第几天
        String day_in_year = calendar.get(Calendar.YEAR) + "";

        // 2.4 当月的第几天
        String day_in_month = calendar.get(Calendar.DAY_OF_MONTH) + "";

        // 2.5 是否为当月的第一天
        String is_first_day_in_month = day_in_month.equals("1") ? "y" : "n";

        // 2.6 是否为当月最后一天
        // 1. 加一天
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        String is_last_day_in_month = calendar.get(Calendar.DAY_OF_MONTH) == 1 ? "y" : "n";
        // 2. 减回去
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        // 2.7 星期
        String weekday = (calendar.get(Calendar.DAY_OF_WEEK) - 1) + "";
        if (weekday.equals("0")) {
            weekday = "7";
        }

        // 2.8 月的第几个星期
        sdf.applyPattern("W");
        String week_in_month = sdf.format(curDate);

        // 2.9 是否周一
        String is_first_day_in_week = calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY ? "y" : "n";

        // 2.10 是否休息日
        String is_dayoff = "n";

        // 2.11 是否工作日
        String is_workday = "n";

        // 2.12 是否国家法定节假日
        String is_holiday = "n";
        // 2.12 国家法定节假日获取URL
        String holiday_url = "http://timor.tech/api/holiday/info/" + date_value;



        // 2.13 日期类型
        String date_type = "workday";

        // 2.14 月份
        sdf.applyPattern("MM");
        String month_number = sdf.format(curDate);

        // 2.15 年份
        sdf.applyPattern("yyyy");
        String year = sdf.format(curDate);

        // 2.16 年份-月份
        sdf.applyPattern("yyyy-MM");
        String year_month_number = sdf.format(curDate);

        // 2.16 季度名称、季度、年季度
        String quarter_name = "";
        String quarter_number = "";
        String year_quarter = "";

        switch (calendar.get(Calendar.MONTH)) {
            case Calendar.FEBRUARY:
            case Calendar.JANUARY:
            case Calendar.MARCH:
                quarter_name = "Q1";
                quarter_number = "1";
                year_quarter = year + "-" + quarter_name;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                quarter_name = "Q2";
                quarter_number = "2";
                year_quarter = year + "-" + quarter_name;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                quarter_name = "Q3";
                quarter_number = "3";
                year_quarter = year + "-" + quarter_name;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                quarter_name = "Q4";
                quarter_number = "4";
                year_quarter = year + "-" + quarter_name;
                break;
        }
    }

}
