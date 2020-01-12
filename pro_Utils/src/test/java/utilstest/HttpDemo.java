package utilstest;


import Utils.Global_utils.http.http_02_client_post;
import Utils.Global_utils.json.json_01parse_http;

/**
 * 针对工具类的测试
 */
public class HttpDemo {
    public static void main(String[] args) {

//        http_01_client http_01_client = new http_01_client();
//        String httpclient = http_01_client.httpclient();
        //调用post返回
        http_02_client_post http_02_client_post = new http_02_client_post();
        String httpclient = http_02_client_post.httpclient();

        System.out.println(httpclient);

        json_01parse_http json_01parse_http = new json_01parse_http();
        json_01parse_http.parsehttp(httpclient);
    }
}
