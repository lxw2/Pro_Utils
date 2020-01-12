package Utils.Date_dim.bean;

public class http_date_holiday {
    //{"date":"2019-10-02","name":"国庆节","holiday":true,"wage":3}'
    String date ;
    String name ;
    String holiday ;
    int wage ;

    @Override
    public String toString() {
        return "http_date_holiday{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", holiday='" + holiday + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
