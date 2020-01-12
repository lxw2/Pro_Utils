package Utils.Date_dim.bean;

import java.io.Serializable;

public class http_date_bean implements Serializable {

    //{"code":0,"type":{"type":0,"name":"周三","week":3},"holiday":null}
    int code ;
    http_date_arr type ;
    http_date_holiday holiday;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "http_date_bean{" +
                "code='" + code + '\'' +
                ", type=" + type +
                ", holiday='" + holiday + '\'' +
                '}';
    }

    public http_date_arr getType() {
        return type;
    }

    public void setType(http_date_arr type) {
        this.type = type;
    }


    public http_date_holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(http_date_holiday holiday) {
        this.holiday = holiday;
    }
}
