package Utils.Date_dim.bean;

public class http_date_arr {


    //"type":{"type":0,"name":"周三","week":3},
    int type ;
    String name ;
    int week ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "http_date_arr{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", week=" + week +
                '}';
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
