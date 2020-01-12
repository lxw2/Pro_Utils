package Utils.Global_utils.json;


import Utils.Date_dim.bean.http_date_bean;
import com.alibaba.fastjson.JSON;

public class json_01parse_http {

    public void parsehttp(String json){

        //解析指定的json日期,并封装到bean中

        http_date_bean http_date_bean = JSON.parseObject(json, http_date_bean.class);

        System.out.println(http_date_bean);

    }

}
